package com.zixieqing.o1simplefactory.o1simplelogic.impl;

import com.zixieqing.o1simplefactory.o1simplelogic.IShopping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  具体商品：优惠卡
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o1simplelogic.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class CouponService implements IShopping {

    private Logger logger = LoggerFactory.getLogger(CouponService.class);

    @Override
    public void sendCommodity(String userId, String goodsName) throws Exception {
        logger.info("用户：{}，通过优惠卡xxxxxx，购买了：{}", userId, goodsName);
    }
}
