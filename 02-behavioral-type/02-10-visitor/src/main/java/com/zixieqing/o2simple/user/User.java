package com.zixieqing.o2simple.user;

import com.zixieqing.o2simple.visitor.Visitor;

/**
 * <p>@description  : 该类功能  抽象元素：用户信息
 *                      1、接收访问者访问
 * </p>
 * <p>@package      : com.zixieqing.o2simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public abstract class User {

    /**
     * 姓名
     */
    public String name;
    /**
     * 身份；重点班、普通班 | 特级教师、普通教师、实习教师
     */
    public String identity;
    /**
     * 班级
     */
    public String clazz;

    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    /**
     * 核心访问方法
     * @param visitor 访问者
     */
    public abstract void accept(Visitor visitor);


}
