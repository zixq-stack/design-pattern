package com.zixieqing.o1derive.impl;

import com.zixieqing.o1derive.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  具体访问者
 * </p>
 * <p>@package      : com.zixieqing.o1derive.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ConcreteVisitor implements Visitor {

    private Logger logger = LoggerFactory.getLogger(ConcreteVisitor.class);

    @Override
    public void visit(Name name) {

        logger.info("{}访问者即将开始元素访问",this.getClass().getSimpleName());

        // 需要访问者，当前这个就是一个具体的访问者，当然：也可以根据情况来弄
        name.accept(this);
    }
}
