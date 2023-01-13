package com.zixieqing.o1simplefactory.o2complex;

import com.zixieqing.o1simplefactory.o2complex.impl.CouponCommodityServiceImpl;
import com.zixieqing.o1simplefactory.o2complex.impl.GoodsCommodityServiceImpl;
import com.zixieqing.o1simplefactory.o2complex.impl.QvodCommodityServiceImpl;

/**
 * <p>@description  : 该类功能  产品工厂
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o2complex</p>
 * <p>@author       : ZiXieqing</p>
 */

public class CommodityFactory {

    /**
     * <p>@description  : 该方法功能 获取产品
     * </p>
     * <p>@methodName   : getCommodity</p>
     * <p>@author: ZiXieqing</p>
     * @param type  产品类型
     * @return com.zixieqing.o1simplefactory.o2complex.ICommodityService
     */
    public ICommodityService getCommodity(Integer type) {
        if (1 == type) return new CouponCommodityServiceImpl();

        if (2 == type) return new QvodCommodityServiceImpl();

        if (3 == type) return new GoodsCommodityServiceImpl();

        throw new RuntimeException("不合法的商品类型");
    }
}
