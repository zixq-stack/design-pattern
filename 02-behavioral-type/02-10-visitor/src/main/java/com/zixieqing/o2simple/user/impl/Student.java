package com.zixieqing.o2simple.user.impl;

import com.zixieqing.o2simple.user.User;
import com.zixieqing.o2simple.visitor.Visitor;

/**
 * <p>@description  : 该类功能  具体元素：学生
 * </p>
 * <p>@package      : com.zixieqing.o2simple.user.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 对这个元素进行的不同且不相关操作之一：排名
     * @return int 排名
     */
    public int ranking() {
        return (int) (Math.random() * 100);
    }
}
