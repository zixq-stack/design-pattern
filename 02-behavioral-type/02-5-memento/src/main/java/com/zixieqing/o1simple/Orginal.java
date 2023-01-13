package com.zixieqing.o1simple;

/**
 * <p>@description  : 该类功能  发起人：需要进行备忘的对象，记录当前时刻的内部属性信息到备忘录中，并返回备忘录对象
 * 并在需要时可从备忘录中记录的状态信息恢复数据
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Orginal {

    private Object field;

    /**
     * 保存当前时刻的状态信息到备忘录中，并返回备忘录对象
     */
    public Memento saveToMemento() {
        return new Memento(this.field);
    }

    /**
     * 从备忘录中恢复当前对象的内部状态信息
     *
     * @param memento 备忘录
     */
    public void rollbackFromMemento(Memento memento) {
        this.field = memento.getState();
    }


    @Override
    public String toString() {
        return "Orginal{" +
                "field=" + field +
                '}';
    }

    public Object getField() {
        return field;
    }

    public void setField(Object field) {
        this.field = field;
    }
}
