package com.zixieqing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  具体模板：对非公有部分进行实现
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class RedBeans extends AbstractSoyMilk{

    private Logger logger = LoggerFactory.getLogger(RedBeans.class);

    @Override
    protected void add() {

        logger.info("{} 正在准备添加原料 ",this.getClass().getSimpleName());

        logger.info("价值3个W的红豆已添加");
    }
}
