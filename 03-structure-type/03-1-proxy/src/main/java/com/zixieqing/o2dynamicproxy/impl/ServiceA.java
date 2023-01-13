package com.zixieqing.o2dynamicproxy.impl;

import com.zixieqing.o2dynamicproxy.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  业务A
 * </p>
 * <p>@package      : com.zixieqing.o2dynamicproxy.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ServiceA implements IService {

    private Logger logger = LoggerFactory.getLogger(ServiceA.class);

    @Override
    public void m1() {
        logger.info("这是{}类的 m1 方法",this.getClass().getSimpleName());
    }

    @Override
    public void m2() {
        logger.info("这是{}类的 m2 方法",this.getClass().getSimpleName());
    }
}
