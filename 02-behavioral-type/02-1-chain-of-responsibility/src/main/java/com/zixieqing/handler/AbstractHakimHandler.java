package com.zixieqing.handler;

/**
 * <p>@description  : 该类功能  抽象处理者：做用户名判断
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public abstract class AbstractHakimHandler {

    private AbstractHakimHandler next;

    public AbstractHakimHandler getNext() {
        return next;
    }

    public void setNext(AbstractHakimHandler next) {
        this.next = next;
    }

    public abstract String hakim(String name);
}
