package com.zixieqing.o1simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  抽象协调者
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public abstract class Coordinator {

    private Logger logger = LoggerFactory.getLogger(Coordinator.class);

    protected Man man;

    protected Woman woman;

    public Coordinator() {
        man = new Man(this);
        woman = new Woman(this);
    }

    /**
     * 中介者 / 协调者的核心方法：处理同事角色关系
     *
     * @param type  事件类型 1、传话；2、退还物品
     * @param thing 发生对应类型时要做的事
     */
    public abstract void handler(int type, String thing);

}
