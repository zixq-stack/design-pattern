package com.zixieqing.o1simplefactory.o2complex;

import java.util.Map;

/**
 * <p>@description  : 该类功能  商品
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o2complex</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface ICommodityService {

    /**
     * <p>@description  : 该方法功能 发送商品
     * </p>
     * <p>@methodName   : sendCommodity</p>
     * <p>@author: ZiXieqing</p>
     * @param uId 用户id
     * @param commodityId 商品id
     * @param bizId 业务id
     * @param extMap  扩展信息
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
