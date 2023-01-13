package com.zixieqing.o1simplefactory.o2complex.impl;

import com.zixieqing.o1simplefactory.o2complex.ICommodityService;
import com.zixieqing.o1simplefactory.o2complex.goods.DeliverRequest;
import com.zixieqing.o1simplefactory.o2complex.goods.GoodsService;
import com.zixieqing.o1simplefactory.o2complex.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * <p>@description  : 该类功能  实物购买商品
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o2complex.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class GoodsCommodityServiceImpl implements ICommodityService {

    private Logger logger = LoggerFactory.getLogger(GoodsCommodityServiceImpl.class);

    /**
     * 模拟注入
     */
    private GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverRequest deliverRequest = new DeliverRequest();
        // 下面这些信息去数据库搞出来
        deliverRequest.setUserName("紫邪情");
        deliverRequest.setUserPhone("123143124342");
        deliverRequest.setSku(commodityId);
        deliverRequest.setOrderId(bizId);
        deliverRequest.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverRequest.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverRequest.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        ResultUtil result = goodsService.deliverGoods(deliverRequest);

        if (!"0000".equals(result.getCode()))
            throw new RuntimeException(result.getInfo());
    }
}
