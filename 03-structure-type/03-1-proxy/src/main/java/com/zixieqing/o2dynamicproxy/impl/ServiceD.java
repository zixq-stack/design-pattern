package com.zixieqing.o2dynamicproxy.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  业务D
 * </p>
 * <p>@package      : com.zixieqing.o2dynamicproxy.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ServiceD {

    private Logger logger = LoggerFactory.getLogger(ServiceD.class);

    public void insertA() {
        logger.info("{}的insertA方法插入了一条数据", this.getClass().getSimpleName());
    }

    public String getB() {
        logger.info("这是{}的方法getB", this.getClass().getSimpleName());
        return "紫邪情";
    }
}
