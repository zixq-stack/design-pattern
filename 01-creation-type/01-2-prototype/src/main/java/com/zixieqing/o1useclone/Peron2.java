package com.zixieqing.o1useclone;

/**
 * <p>@description  : 该类功能  原型类（属性是引用数据类型时）
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Peron2 implements Cloneable{
    private Person person;

    public Peron2() {
    }

    public Peron2(Person person) {
        this.person = person;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Peron2 peron2 = null;

        try {
            peron2 = (Peron2) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return peron2;
    }

    @Override
    public String toString() {
        return "Peron2{" +
                "person=" + person +
                '}';
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
