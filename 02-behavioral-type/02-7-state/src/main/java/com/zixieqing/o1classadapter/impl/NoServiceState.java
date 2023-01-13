package com.zixieqing.o1classadapter.impl;

import com.zixieqing.ATMContext;
import com.zixieqing.ATMState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  具体状态：停止服务
 * </p>
 * <p>@package      : com.zixieqing.o1class$adapter.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class NoServiceState implements ATMState {

    private ATMContext atmContext;

    public NoServiceState(ATMContext atmContext) {
        this.atmContext = atmContext;
    }

    private Logger logger = LoggerFactory.getLogger(NoServiceState.class);

    @Override
    public void insertCard() {
        logger.info("服务停止，请去其他取款机进行业务办理");
    }

    @Override
    public void submitPwd() {
        logger.info("服务停止，请去其他取款机进行业务办理");
    }

    @Override
    public void getCash() {
        logger.info("服务停止，请去其他取款机进行业务办理");
    }

    @Override
    public void queryBalance() {
        logger.info("服务停止，请去其他取款机进行业务办理");
    }

    @Override
    public void checkOut() {
        logger.info("服务停止，请去其他取款机进行业务办理");
    }
}
