package com.zixieqing;

import com.zixieqing.o1simplefactory.o1simplelogic.IShopping;
import com.zixieqing.o1simplefactory.o1simplelogic.ShoppingFactory;
import com.zixieqing.o1simplefactory.o2complex.CommodityFactory;
import com.zixieqing.o1simplefactory.o2complex.ICommodityService;

import java.util.HashMap;
import java.util.UUID;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class APITest {

    public static void main(String[] args) throws Exception{

        ShoppingFactory shoppingFactory = new ShoppingFactory();

        // 1、优惠卡类型
        IShopping shopping_1 = shoppingFactory.shopping(1);
        shopping_1.sendCommodity(System.nanoTime()+"", "充气娃娃");

        System.out.println("================华丽的分割线===================");

        // 2、快播兑换卡
        IShopping shopping_2 = shoppingFactory.shopping(2);
        shopping_2.sendCommodity(System.nanoTime()+"", "AI女票");

        System.out.println("================华丽的分割线===================");

        IShopping shopping_3 = shoppingFactory.shopping(3);
        shopping_3.sendCommodity(System.nanoTime()+"", "枸杞");


        System.out.println();
        System.out.println("================华丽的分割线：简单工厂+单例实现===================");


        IShopping shop_2 = shoppingFactory.shop(2);
        shop_2.sendCommodity(System.nanoTime()+"", "充气娃娃");

        System.out.println("================华丽的分割线===================");

        // 2、快播兑换卡
        IShopping shop_1 = shoppingFactory.shop(1);
        shop_1.sendCommodity(System.nanoTime()+"", "AI女票");

        System.out.println("================华丽的分割线===================");

        IShopping shop_3 = shoppingFactory.shop(3);
        shop_3.sendCommodity(System.nanoTime()+"", "枸杞");

        System.out.println();
        System.out.println("================华丽的分割线：简单结合业务开发进行测试===================");



        CommodityFactory commodityFactory = new CommodityFactory();

        // 1、优惠卡类型
        ICommodityService commodity_1 = commodityFactory.getCommodity(1);
        commodity_1.sendCommodity(System.nanoTime() + "",
                System.currentTimeMillis() + "",
                UUID.randomUUID() + "",
                null);

        // 2、快播兑换卡
        ICommodityService commodity_2 = commodityFactory.getCommodity(2);
        commodity_2.sendCommodity(System.nanoTime() + "",
                System.currentTimeMillis() + "",
                UUID.randomUUID() + "",
                null);

        // 3、实物购买
        ICommodityService commodity_3 = commodityFactory.getCommodity(3);
        HashMap<String, String> extMap = new HashMap<>();
        extMap.put("consigneeUserName", "紫邪情");
        extMap.put("consigneeUserPhone", "31343214321432");
        extMap.put("consigneeUserAddress", "浙江省.杭州市.余杭区.XX街道.YY小区.324134321431");
        commodity_3.sendCommodity(System.nanoTime() + "",
                System.currentTimeMillis() + "",
                UUID.randomUUID() + "",
                extMap);
    }
}
