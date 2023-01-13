package com.zixieqing.o1simple;

/**
 * <p>@description  : 该类功能  负责人：管理备忘录，提供获取、保存备忘录对象的方法，但不可以对备忘录中的内容进行操作
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
