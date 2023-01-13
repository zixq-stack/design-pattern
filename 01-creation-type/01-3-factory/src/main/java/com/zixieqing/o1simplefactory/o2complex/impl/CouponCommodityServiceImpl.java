package com.zixieqing.o1simplefactory.o2complex.impl;

import com.zixieqing.o1simplefactory.o2complex.ICommodityService;
import com.zixieqing.o1simplefactory.o2complex.coupon.CouponService;
import com.zixieqing.o1simplefactory.o2complex.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.UUID;

/**
 * <p>@description  : 该类功能  优惠券实现商品购买
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o2complex.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class CouponCommodityServiceImpl implements ICommodityService {

    private Logger logger = LoggerFactory.getLogger(CouponCommodityServiceImpl.class);

    /**
     * 模拟@autowried注入
     */
    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        ResultUtil result = couponService.sendCoupon(uId, commodityId, UUID.randomUUID().toString());

        if (!"0000".equals(result.getCode()))
            throw new RuntimeException(result.getInfo());
    }
}
