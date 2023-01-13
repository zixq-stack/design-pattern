package com.zixieqing.o2simple;

import com.zixieqing.o2simple.user.User;
import com.zixieqing.o2simple.user.impl.Student;
import com.zixieqing.o2simple.user.impl.Teacher;
import com.zixieqing.o2simple.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@description  : 该类功能  对象结构/数据看板
 *                      1、添加元素
 *                      2、访问所有元素
 * </p>
 * <p>@package      : com.zixieqing.o2simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public class DataView {
    private List<User> userList = new ArrayList<User>();

    public DataView() {
        userList.add(new Student("谢飞机", "重点班", "一年一班"));
        userList.add(new Student("windy", "重点班", "一年一班"));
        userList.add(new Student("大毛", "普通班", "二年三班"));
        userList.add(new Student("Shing", "普通班", "三年四班"));
        userList.add(new Teacher("BK", "特级教师", "一年一班"));
        userList.add(new Teacher("娜娜Goddess", "特级教师", "一年一班"));
        userList.add(new Teacher("dangdang", "普通教师", "二年三班"));
        userList.add(new Teacher("泽东", "实习教师", "三年四班"));
    }

    /**
     * 获取所有元素
     * @param visitor 访问者
     */
    public void show(Visitor visitor) {
        for (User user : userList) {
            user.accept(visitor);
        }
    }
}
