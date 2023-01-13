package com.zixieqing.o3hunger;

/**
 * <p>@description  : 该类功能  饿汉式实现
 * 这种方式和利用static的方式是异曲同工的
 * </p>
 * <p>@package      : com.zixieqing.o3hunger</p>
 * <p>@author       : ZiXieqing</p>
 */

public class HungerSingleton {

    private static HungerSingleton HUNGER_SINGLETON_INSTANCE = new HungerSingleton();

    private HungerSingleton() {}

    /**
     * 这种方式其实也不安全
     * 因为当多线程在if判断时如果在同一时刻二者都判断成立，就会创建不同的实例
     */
    public static HungerSingleton getInstance() {
        if (HUNGER_SINGLETON_INSTANCE != null) return HUNGER_SINGLETON_INSTANCE;

        HUNGER_SINGLETON_INSTANCE = new HungerSingleton();
        return HUNGER_SINGLETON_INSTANCE;
    }
}
