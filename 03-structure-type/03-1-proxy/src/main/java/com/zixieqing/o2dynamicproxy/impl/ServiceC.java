package com.zixieqing.o2dynamicproxy.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  业务C
 * </p>
 * <p>@package      : com.zixieqing.o2dynamicproxy.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ServiceC {

    private Logger logger = LoggerFactory.getLogger(ServiceC.class);

    public String m1() {
        logger.info("这是普通类{}的 m1 方法",this.getClass().getSimpleName());

        return "tall is cheap";
    }

    public String m2() {
        logger.info("这是普通类{}的 m1 方法",this.getClass().getSimpleName());

        return "show me the code";
    }
}
