package com.zixieqing.o1simplefactory.o1simplelogic;

/**
 * <p>@description  : 该类功能  抽象产品：购物
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o1simplelogic</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface IShopping {

    /**
     * <p>@description  : 该方法功能 发送商品
     * </p>
     * <p>@methodName   : sendCommodity</p>
     * <p>@author: ZiXieqing</p>
     * @param userId 用户id
     * @param goodsName  商品名
     */
    void sendCommodity(String userId, String goodsName) throws Exception;
}
