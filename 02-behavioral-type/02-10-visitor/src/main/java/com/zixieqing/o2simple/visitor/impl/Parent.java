package com.zixieqing.o2simple.visitor.impl;

import com.zixieqing.o2simple.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.zixieqing.o2simple.user.impl.*;

/**
 * <p>@description  : 该类功能  具体访问者：家长
 * </p>
 * <p>@package      : com.zixieqing.o2simple.visitor.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Parent implements Visitor {
    private Logger logger = LoggerFactory.getLogger(Parent.class);

    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{} 排名：{}", student.name, student.clazz, student.ranking());
    }

    public void visit(Teacher teacher) {
        logger.info("老师信息 姓名：{} 班级：{} 级别：{}", teacher.name, teacher.clazz, teacher.identity);
    }
}
