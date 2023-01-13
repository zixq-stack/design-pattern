package com.zixieqing.o2dynamicproxy.o1jdkproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>@description  : 该类功能  jdk动态代理示例：接口耗时统计
 * </p>
 * <p>@package      : com.zixieqing.o1staticproxy</p>
 * <p>@author       : ZiXieqing</p>
 */

// 1、实现InvocationHandler接口   每个代理实例都有一个关联的调用处理程序对象，它实现了接口InvocationHandler
public class CostTimeInvocationHandler implements InvocationHandler {

    private Logger logger = LoggerFactory.getLogger(CostTimeInvocationHandler.class);

    /**
     * 2、聚合真实对象
     */
    private Object target;

    public CostTimeInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long startTime = System.nanoTime();

        Object result = method.invoke(this.target, args);

        logger.info("{} 的 {}方法 耗时 {} 纳秒", this.target.getClass(), method.getName(), (System.nanoTime() - startTime));

        return result;
    }

    /**
     * 创建代理对象
     * @param target 真实角色
     * @param targetInterface 这个真实角色实现的接口
     * @param <T>
     * @return
     */
    public static <T> T createProxy(Object target, Class<T> targetInterface) {
        if (!targetInterface.isInterface())
            throw new IllegalStateException("targetInterface必须是一个接口类型");

        if (!targetInterface.isAssignableFrom(target.getClass()))
            throw new IllegalStateException("target必须是targetInterface的实现类");

        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                          target.getClass().getInterfaces(),
                                          new CostTimeInvocationHandler(target));
    }
}
