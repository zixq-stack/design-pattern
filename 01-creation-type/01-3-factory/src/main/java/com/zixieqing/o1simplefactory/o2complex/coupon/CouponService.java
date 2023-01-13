package com.zixieqing.o1simplefactory.o2complex.coupon;

import com.zixieqing.o1simplefactory.o2complex.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  模拟发放优惠券业务
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o2complex.coupon</p>
 * <p>@author       : ZiXieqing</p>
 */

public class CouponService {

    private Logger logger = LoggerFactory.getLogger(CouponService.class);

    /**
     * <p>@description  : 该方法功能 发放优惠券
     * </p>
     * <p>@methodName   : sendCoupon</p>
     * <p>@author: ZiXieqing</p>
     * @param uId 用户id
     * @param couponNumber 分配的优惠券号码
     * @param uuid  随机生成的uuid号
     * @return com.zixieqing.o1simplefactory.o2complex.util.ResultUtil
     */
    public ResultUtil sendCoupon(String uId, String couponNumber, String uuid) {
        logger.info("发放优惠券业务准备启动..........");

        logger.info("用户：{}，获得了优惠券：{}", uId, uId + couponNumber + uuid);

        return new ResultUtil("0000", "优惠券发放成功");
    }
}
