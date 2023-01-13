package com.zixieqing.o2simple.visitor;

import com.zixieqing.o2simple.user.impl.*;

/**
 * <p>@description  : 该类功能  访问者：访问每个具体元素
 * </p>
 * <p>@package      : com.zixieqing.o2simple.visitor</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface Visitor {
    /**
     * 访问学生信息
     * @param student 具体元素：学生
     */
    void visit(Student student);

    /**
     * 访问老师信息
     * @param teacher 具体元素：老师
     */
    void visit(Teacher teacher);

}
