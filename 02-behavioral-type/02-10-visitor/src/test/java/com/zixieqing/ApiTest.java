package com.zixieqing;

import com.zixieqing.o2simple.DataView;
import com.zixieqing.o2simple.visitor.impl.Parent;
import com.zixieqing.o2simple.visitor.impl.Principal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(ApiTest.class);

        // SubjectStructure subjectStructure = new SubjectStructure();
        // // 添加要访问的元素
        // subjectStructure.addElement(new Name());
        // // 通过对象结构+具体访问者进行元素访问
        // subjectStructure.getPeoples(new ConcreteVisitor());


        DataView dataView = new DataView();

        logger.info("\r\n家长视角访问：");
        // 家长
        dataView.show(new Parent());

        logger.info("\r\n校长视角访问：");
        // 校长
        dataView.show(new Principal());
    }
}
