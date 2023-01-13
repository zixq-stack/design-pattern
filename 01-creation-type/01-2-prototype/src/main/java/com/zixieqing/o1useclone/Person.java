package com.zixieqing.o1useclone;

import java.io.Serializable;

/**
 * <p>@description  : 该类功能  原型类（属性都是基本数据类型时）
 * Cloneable 标志Object.clone()方法可以对Person该类的实例进行字段的复制
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Person implements Cloneable, Serializable {

    private static final long serialVersionUID = -3085775366348440899L;

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = null;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
