package com.zixieqing.o4innerclass;

/**
 * <p>@description  : 该类功能  使用内部类实现 - 推荐的一种</p>
 * <p>@package      : com.zixieqing.o4innerclass</p>
 * <p>@author       : ZiXieqing</p>
 */

public class InnerClassSingleton {

    /**
     * 1、private的构造
     */
    private InnerClassSingleton() {}

    /**
     * 2、private static的内部类
     * 巧妙之处：使用static修饰，则：做到线程安全，也巧妙借助了第一种实现方式：使用static的形式
     * 同时：内部类可以访问外部类的静态属性和静态方法
     */
    private static class NewInstance{
        public static InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    /**
     * 3、public static对外提供获取当前类实例的方法
     */
    public static InnerClassSingleton getInstance() {
        return NewInstance.INSTANCE;
    }
}
