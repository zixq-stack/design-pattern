package com.zixieqing.o1simplefactory.o2complex.goods;

import com.alibaba.fastjson.JSON;
import com.zixieqing.o1simplefactory.o2complex.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  实物购买商品业务
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o2complex.goods</p>
 * <p>@author       : ZiXieqing</p>
 */

public class GoodsService {

    private Logger logger = LoggerFactory.getLogger(GoodsService.class);

    /**
     * <p>@description  : 该方法功能 发货
     * </p>
     * <p>@methodName   : deliverGoods</p>
     * <p>@author: ZiXieqing</p>
     * @param deliverRequest  辅助：支付对象
     * @return com.zixieqing.o1simplefactory.o2complex.util.ResultUtil
     */
    public ResultUtil deliverGoods(DeliverRequest deliverRequest) {
        logger.info("模拟发送实物商品一个：{}", JSON.toJSONString(deliverRequest));
        return new ResultUtil("0000", "发货成功：" + deliverRequest);
    }
}
