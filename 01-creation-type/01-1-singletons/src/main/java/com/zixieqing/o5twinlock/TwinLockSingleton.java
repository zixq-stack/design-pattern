package com.zixieqing.o5twinlock;

/**
 * <p>@description  : 该类功能  双重锁校验（线程安全）</p>
 * <p>@package      : com.zixieqing.o5twinlock</p>
 * <p>@author       : ZiXieqing</p>
 */

public class TwinLockSingleton {

    /**
     * 最好加上volatile关键字，它的作用是：不进行指令重排（指令重排是JVM中的）
     */
    private static volatile TwinLockSingleton INSTANCE;

    private TwinLockSingleton() {}

    public static TwinLockSingleton getInstance() {

        if (null != INSTANCE) return INSTANCE;

        // 双重验证：synchronized 和 if
        synchronized (TwinLockSingleton.class) {
            if (null == INSTANCE) return INSTANCE = new TwinLockSingleton();
        }
        return INSTANCE;
    }
}
