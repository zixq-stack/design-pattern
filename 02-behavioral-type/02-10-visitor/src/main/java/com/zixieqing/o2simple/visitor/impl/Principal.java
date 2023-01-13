package com.zixieqing.o2simple.visitor.impl;

import com.zixieqing.o2simple.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.zixieqing.o2simple.user.impl.*;

/**
 * <p>@description  : 该类功能  具体访问者：校长
 * </p>
 * <p>@package      : com.zixieqing.o2simple.visitor.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Principal implements Visitor {

    private Logger logger = LoggerFactory.getLogger(Principal.class);

    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{}", student.name, student.clazz);
    }

    public void visit(Teacher teacher) {
        logger.info("学生信息 姓名：{} 班级：{} 升学率：{}", teacher.name, teacher.clazz, teacher.entranceRatio());
    }
}
