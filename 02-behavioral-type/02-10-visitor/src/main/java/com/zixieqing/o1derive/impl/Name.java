package com.zixieqing.o1derive.impl;

import com.zixieqing.o1derive.People;
import com.zixieqing.o1derive.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  具体元素
 *                      1、让访问者能够对原有类中的属性进行操作
 * </p>
 * <p>@package      : com.zixieqing.o1derive.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Name implements People {

    private Logger logger = LoggerFactory.getLogger(Name.class);

    @Override
    public void accept(Visitor visitor) {
        logger.info("{}这个类就是原来类中的属性，这个{}类中就可以进行这个{}属性的不同且不相关的操作",
                this.getClass().getSimpleName(),
                this.getClass().getSimpleName(),
                this.getClass().getSimpleName().toLowerCase());
    }
}
