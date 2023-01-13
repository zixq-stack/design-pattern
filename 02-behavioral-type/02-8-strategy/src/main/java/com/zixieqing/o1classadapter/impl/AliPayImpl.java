package com.zixieqing.o1classadapter.impl;

import com.zixieqing.PayStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  具体策略：支付宝支付
 * </p>
 * <p>@package      : com.zixieqing.o1class$adapter.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class AliPayImpl implements PayStrategy {

    private Logger logger = LoggerFactory.getLogger(AliPayImpl.class);

    @Override
    public void pay() {
        logger.info("支付宝支付和微信支付逻辑差不多的，假设这里就是一堆的支付宝支付逻辑，意思意思");
    }
}
