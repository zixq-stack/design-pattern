package com.zixieqing;

import com.zixieqing.o2dynamicproxy.impl.ServiceA;
import com.zixieqing.o2dynamicproxy.impl.ServiceC;
import com.zixieqing.o2dynamicproxy.impl.ServiceD;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * <p>@description  : 该类功能  动态代理之CGLIB动态代理测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class CglibProxyTest {

    private Logger logger = LoggerFactory.getLogger(CglibProxyTest.class);

    @Test
    public void methodInterceptorTest() {
        // 1、创建enhancer
        Enhancer enhancer = new Enhancer();

        // 2、设置给谁做代理：Enhancer创建一个被代理对象的子类并且拦截所有的方法调用（非final修饰的类或方法）
        enhancer.setSuperclass(ServiceA.class);

        /*3、设置回调：现org.springframework.cglib.proxy.Callback接口，MethodInterceptor接口也是其子类
        当调用代理对象的任何方法的时候，都会被MethodInterceptor接口的invoke方法处理*/
        enhancer.setCallback(new MethodInterceptor() {
            /**
             * 代理对象的方法拦截器
             * @param proxy 代理对象的实例
             * @param method 真实角色的方法，即：ServiceA中的方法
             * @param objects 调用方法传递的参数
             * @param methodProxy 方法的代理对象
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

                logger.info("这是Enhancer的方法拦截器MethodInterceptor中的invoke，即将调用；{}",method.getName());
                return methodProxy.invokeSuper(proxy, objects);

            }
        });

        // 4、创建代理对象 强转
        ServiceA service = (ServiceA) enhancer.create();

        // 5、通过代理对象访问真实对象
        service.m1();

        System.out.println("================华丽的分隔符=============");

        service.m2();
    }


    @Test
    public void fixedValueTest() {
        // 1、创建enhancer
        Enhancer enhancer = new Enhancer();

        // 2、设置给谁做代理：Enhancer创建一个被代理对象的子类并且拦截所有的方法调用（非final修饰的类或方法）
        enhancer.setSuperclass(ServiceC.class);

        /*3、设置回调：现org.springframework.cglib.proxy.Callback接口，FixedValue接口也是其子接口
        当调用代理对象的任何方法的时候，都会被FixedValue接口的loadObject方法处理*/
        enhancer.setCallback(new FixedValue() {
            /**
             * 代理对象：拦截所有方法 并 返回固定的内容
             * @return 要返回的内容
             * @throws Exception
             */
            @Override
            public Object loadObject() throws Exception {
                logger.info("这是Enhancer的FixedValue拦截所有方法 并 返回给定内容");

                return "代理对象的FixedValue已经执行完毕";
            }
        });

        // 4、创建代理对象 强转
        ServiceC service = (ServiceC) enhancer.create();

        // 5、通过代理对象访问真实对象
        logger.info(service.m1());


        logger.info(service.m2());
    }


    @Test
    public void noOP_INSTANCETest() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ServiceC.class);
        // 不做任何处理，直接放行
        enhancer.setCallback(NoOp.INSTANCE);
        ServiceC serviceC = (ServiceC) enhancer.create();

        System.out.println(serviceC.m1());
        System.out.println(serviceC.m2());
    }


    /**
     * 需求：
     *      insert开头的方法统计耗时时间
     *      get开头的方法直接返回固定内容
     */
    @Test
    public void callbackFilterTest() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ServiceD.class);
        // 数组写法
        Callback[] callbacks = {
            new MethodInterceptor() {
                /**
                 * 对象代理：insert开头的方法应该做的逻辑：统计耗时时间
                 * @param o 代理对象
                 * @param method 真实对象中的方法
                 * @param objects 调用方法传递的参数
                 * @param methodProxy 方法代理
                 * @return
                 * @throws Throwable
                 */
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    long startTime = System.nanoTime();
                    Object result = methodProxy.invokeSuper(o, objects);
                    logger.info("执行时间为：{}纳秒", (System.nanoTime()) - startTime);
                    return result;
                }
            },
            new FixedValue() {
            /**
             * get开头的方法应该做的逻辑：返回固定字符串
             * @return
             * @throws Exception
             */
            @Override
            public Object loadObject() throws Exception {
                return "当前库正在进行迁移，无法访问！！";
            }
        }
        };

        // 第二个变化的地方：调用setCallbacks，将上一步的数组写法Callback[] callbacks传进去
        enhancer.setCallbacks(callbacks);

        // 多一步：设置过滤逻辑
        enhancer.setCallbackFilter(new CallbackFilter() {
            /**
             * 方法过滤
             * @param method 真实对象中的方法
             * @return 索引值
             */
            @Override
            public int accept(Method method) {
                // 如果方法是以insert开头，那就去找callbacks[0] 即：上面的MethodInterceptor，否则就是FixedValue
                return method.getName().startsWith("insert") ? 0 : 1;
            }
        });

        ServiceD serviceD = (ServiceD) enhancer.create();

        // insert统计耗时
        serviceD.insertA();
        // get返回固定字符串
        System.out.println(serviceD.getB());
    }

    @Test
    public void callbackHelperTest() {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ServiceD.class);

        // 方法是insert开头时要做的事情
        Callback costTime = (MethodInterceptor) (Object o,
                                                 Method method,
                                                 Object[] objects,
                                                 MethodProxy methodProxy) -> {
            long startTime = System.currentTimeMillis();
            Object result = methodProxy.invokeSuper(o, objects);
            System.out.println("此任务花费了：" + (System.currentTimeMillis() - startTime) + "纳秒");
            return result;
        };

        // 以get开头的方法要做的事情
        Callback returnConstStr = (FixedValue) () -> "紫邪情";

        // CallbackHelper(Class superclass, Class[] interfaces)
        CallbackHelper callbackHelper = new CallbackHelper(ServiceD.class, null) {
            /**
             * 判断业务该怎么走
             * @param method 方法
             * @return
             */
            @Override
            protected Object getCallback(Method method) {
                return method.getName().startsWith("insert") ? costTime : returnConstStr;
            }
        };

        // 给enhancer添加Callbacks数组
        enhancer.setCallbacks(callbackHelper.getCallbacks());
        // 让CallbackHelper成为enhancer的过滤对象
        enhancer.setCallbackFilter(callbackHelper);

        /*
            测试
         */
        ServiceD serviceD = (ServiceD) enhancer.create();
        serviceD.insertA();

        System.out.println("================华丽的分隔符=============");

        System.out.println(serviceD.getB());
    }
}
