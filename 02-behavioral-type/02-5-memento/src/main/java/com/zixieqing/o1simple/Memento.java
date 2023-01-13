package com.zixieqing.o1simple;

/**
 * <p>@description  : 该类功能  备忘录：存储发起人的内部状态信息，并在需要时能够将存储的数据交出去
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Memento {
    private Object state;

    public Memento(Object state) {
        this.state = state;
    }

    public Object getState() {
        return state;
    }
}
