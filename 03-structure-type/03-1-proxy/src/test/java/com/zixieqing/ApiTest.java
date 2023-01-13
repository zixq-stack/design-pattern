package com.zixieqing;

import com.zixieqing.o2dynamicproxy.o1jdkproxy.CostTimeInvocationHandler;
import com.zixieqing.o1staticproxy.IHouse;
import com.zixieqing.o1staticproxy.impl.Landlord;
import com.zixieqing.o1staticproxy.impl.ProxyLandlord;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void noProxy() {
        // 无代理的情况
        IHouse landlord = new Landlord();
        landlord.rent();


        System.out.println("===============华丽的分隔符==============");


        // 静态代理测试

        IHouse proxyLandlord = new ProxyLandlord(landlord);

        // 使用代理角色访问真实角色
        proxyLandlord.rent();
    }

    @Test
    public void o1jdkProxy() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 1、获取接口的代理类Class对象
        Class<IHouse> proxyClass = (Class<IHouse>) Proxy.getProxyClass(IHouse.class.getClassLoader(), IHouse.class);

        // 2、创建代理类的处理器
        InvocationHandler invocationHandler = new InvocationHandler() {
            /**
             * InvocationHandler接口下的invoke方法，处理代理实例上的方法调用
             * @param proxy 调用该方法的代理实例
             * @param method 调用代理实例上的接口方法的实例
             * @param args 代理实例的参数值的对象
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                logger.info("这里是InvocationHandler，被调用的方法是：{}",method.getName());

                return null;
            }
        };

        // 3、创建代理实例
        IHouse iHouse = proxyClass.getConstructor(InvocationHandler.class).newInstance(invocationHandler);

        // 4、调用代理实例上的方法
        iHouse.rent();
    }


    @Test
    public void simpleWayProxy() {
        // 1、使用invocationHandler接口创建代理类的处理器
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                logger.info("这是InvocationHandler，被调用的方法是：{}", method.getName());
                return null;
            }
        };

        // 2、直接调用Proxy的静态方法newProxyInstance()创建代理对象
        IHouse ihouse = (IHouse) Proxy.newProxyInstance(IHouse.class.getClassLoader(), new Class[]{IHouse.class}, invocationHandler);

        // 3、使用代理对象操作真实对象
        ihouse.rent();
    }


    @Test
    public void jdkProxyDemo() {
        // 获取代理对象
        IHouse house = CostTimeInvocationHandler.createProxy(new Landlord(), IHouse.class);

        // 使用代理对象调用真实对象中的方法，自然会进入InvocationHandler接口的invoke()中
        house.rent();
    }
}
