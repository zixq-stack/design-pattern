package com.zixieqing.o1simplefactory.o1simplelogic.impl;

import com.zixieqing.o1simplefactory.o1simplelogic.IShopping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  具体商品：啥也不用，直接实物购买
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o1simplelogic.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class GoodsService implements IShopping {

    private Logger logger = LoggerFactory.getLogger(GoodsService.class);

    @Override
    public void sendCommodity(String userId, String goodsName) throws Exception {
        logger.info("用户：{}，实物购买了：{}", userId, goodsName);
    }
}
