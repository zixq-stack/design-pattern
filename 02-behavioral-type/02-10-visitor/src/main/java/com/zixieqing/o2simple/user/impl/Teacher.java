package com.zixieqing.o2simple.user.impl;

import com.zixieqing.o2simple.user.User;
import com.zixieqing.o2simple.visitor.Visitor;

import java.math.BigDecimal;

/**
 * <p>@description  : 该类功能  具体元素：老师
 * </p>
 * <p>@package      : com.zixieqing.o2simple.user.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Teacher extends User {
    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    /**
     * 对这个具体元素进行的不同且不相关的操作之一：升本率
     * @return double 升学率
     */
    public double entranceRatio() {
        return BigDecimal.valueOf(Math.random() * 100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
