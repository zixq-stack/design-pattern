package com.zixieqing.o2lazy;

/**
 * <p>@description  : 该类功能  懒汉式
 *  此种方式不安全：好比多个人抢厕所，会造成不安全，可能有多个人抢到
 * </p>
 * <p>@package      : com.zixieqing.o2lazy</p>
 * <p>@author       : ZiXieqing</p>
 */

public class LazySingleton {

    /**
     * 1、private static 当前类的属性
     */
    private static LazySingleton LAZY_SINGLETON_INSTANCE;

    /**
     * 2、private 的构造
     */
    private LazySingleton() {
    }

    /**
     * 3、提供public static 创建当前类对象的方法
     */
    public static LazySingleton getInstance() {
        if (LAZY_SINGLETON_INSTANCE != null) return LAZY_SINGLETON_INSTANCE;

        LAZY_SINGLETON_INSTANCE = new LazySingleton();
        return LAZY_SINGLETON_INSTANCE;

    }

    /**
     * 4、要想稍微安全就加synchronized同步锁
     * 但是：此种方式因为把synchronized加在了方法上，导致所有访问争锁而出现 资源的浪费
     */
/*    public static synchronized lazy_unsafe_singleton getInstance() {
        if (LAZY_UNSAFE_INSTANCE_SINGLETON != null) return LAZY_UNSAFE_INSTANCE_SINGLETON;

        LAZY_UNSAFE_INSTANCE_SINGLETON = new Singleton_lazy_unsafe();
        return LAZY_UNSAFE_INSTANCE_SINGLETON;

    }*/
}
