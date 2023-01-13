package com.zixieqing.o1staticproxy.impl;

import com.zixieqing.o1staticproxy.IHouse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  真实角色：房东
 * </p>
 * <p>@package      : com.zixieqing.o1staticproxy.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Landlord implements IHouse {

    private Logger logger = LoggerFactory.getLogger(Landlord.class);

    @Override
    public void rent() {
        logger.info("{}有房子出售",this.getClass().getSimpleName());
    }
}
