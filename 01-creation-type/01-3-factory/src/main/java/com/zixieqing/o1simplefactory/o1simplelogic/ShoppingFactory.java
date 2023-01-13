package com.zixieqing.o1simplefactory.o1simplelogic;

import com.zixieqing.o1simplefactory.o1simplelogic.impl.CouponService;
import com.zixieqing.o1simplefactory.o1simplelogic.impl.GoodsService;
import com.zixieqing.o1simplefactory.o1simplelogic.impl.QvodCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>@description  : 该类功能  产品工厂：购物工厂
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o1simplelogic</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ShoppingFactory {

    private Logger logger = LoggerFactory.getLogger(ShoppingFactory.class);

    /**
     * 结合单例
     */
    private static Map<Integer, IShopping> SHOP_CACHE = new HashMap<>();

    static {
        SHOP_CACHE.put(1, new CouponService());
        SHOP_CACHE.put(2, new QvodCardService());
        SHOP_CACHE.put(3, new GoodsService());
    }

    /**
     * <p>@description  : 该方法功能 购物
     * </p>
     * <p>@methodName   : shopping</p>
     * <p>@author: ZiXieqing</p>
     * @param type  购物方式 1、优惠卡；2、快播兑换卡；3、实物购买
     * @return com.zixieqing.o1simplefactory.o1simplelogic.IShopping
     */
    public IShopping shopping(Integer type) {
        if (null == type) return null;

        logger.info("正在拣货.....");

        if (1 == type) return new CouponService();

        if (2 == type) return new QvodCardService();

        if (3 == type) return new GoodsService();

        throw new RuntimeException("不存在的商品服务类型");
    }

    /**
     * <p>@description  : 该方法功能 简单工厂+单例模式实现购物
     * </p>
     * <p>@methodName   : shop</p>
     * <p>@author: ZiXieqing</p>
     * @param type 商品类型
     * @return com.zixieqing.o1simplefactory.o1simplelogic.IShopping
     */
    public IShopping shop(Integer type) {

        IShopping shopping = SHOP_CACHE.get(type);

        if (null != shopping) return shopping;

        throw new RuntimeException("商品类型不合法");
    }
}
