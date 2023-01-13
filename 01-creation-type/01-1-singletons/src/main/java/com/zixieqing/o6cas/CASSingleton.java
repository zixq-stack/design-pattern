package com.zixieqing.o6cas;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <p>@description  : 该类功能  利用CAS算法实现
 * 好处：CAS的忙等算法是靠底层硬件，所以：保证了线程安全 和 不会产生线程的切换和阻塞的开销，从而提高性能
 *      并且：可以支持较大的并发性
 * </p>
 * <p>@package      : com.zixieqing.o6cas</p>
 * <p>@author       : ZiXieqing</p>
 */

public class CASSingleton {

    private static CASSingleton CAS_SINGLETON_INSTANCE;

    /**
     * AtomicReference<K> 原子引用  保存“一个”K实例
     */
    private static final AtomicReference<CASSingleton> INSTANCE = new AtomicReference<>();

    public static CASSingleton getInstance() {

        /*
            这里可以用for(;;)一样的
            缺点就在这里：CAS的忙等   从而造成：如果一直没有获取就会处于死循坏当中
         */
        while (true) {
            CAS_SINGLETON_INSTANCE = INSTANCE.get();
            if (null != CAS_SINGLETON_INSTANCE) return CAS_SINGLETON_INSTANCE;
        /*
            boolean compareAndSet(V expect, V update)
                expect 预期值
                update 要改成的新值
                如果当前值和预期值相等，那么就以原子的方式将值改为新值

             下列逻辑：期望INSTANCE是null，所以将INSTANCE的值改为new Singleton_CAS()
         */
            INSTANCE.compareAndSet(null, new CASSingleton());
            // 获取INSTANCE的值 返回值就是AtomicReference<Singleton_CAS>中的泛型类型
            return INSTANCE.get();
        }
    }
}
