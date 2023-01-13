package com.zixieqing.o1simplefactory.o2complex.impl;

import com.zixieqing.o1simplefactory.o2complex.ICommodityService;
import com.zixieqing.o1simplefactory.o2complex.qvod.QvodService;
import com.zixieqing.o1simplefactory.o2complex.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * <p>@description  : 该类功能  快播兑换卡实现商品购买
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o2complex.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class QvodCommodityServiceImpl implements ICommodityService {

    private Logger logger = LoggerFactory.getLogger(CouponCommodityServiceImpl.class);

    /**
     * 模拟注入
     */
    private QvodService qvodService = new QvodService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        // 这里把电话号码定死，模拟而已
        ResultUtil result = qvodService.grentToken("12345678910", bizId + commodityId);

        logger.info("通过快播兑换卡：{}，获取商品：{}", bizId + commodityId, commodityId);

        if (!"0000".equals(result.getCode()))
            throw new RuntimeException(result.getInfo());
    }
}
