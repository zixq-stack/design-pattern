package com.zixieqing.o2useserialize;

import com.zixieqing.o1useclone.Person;

import java.io.Serializable;

/**
 * <p>@description  : 该类功能  原型类
 * </p>
 * <p>@package      : com.zixieqing.o2useserialize</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Person3 implements Serializable {

    private static final long serialVersionUID = 1612315444768401267L;

    /**
     * 0 为女
     * 1 为男
     */
    private int sex;

    private Person person;

    public Person3() {
    }

    public Person3(int sex, Person person) {
        this.sex = sex;
        this.person = person;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "sex=" + sex +
                ", person=" + person +
                '}';
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
