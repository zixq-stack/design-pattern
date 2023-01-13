package com.zixieqing.channel;

import com.zixieqing.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * <p>@description  : 该类功能  扩展抽象化角色
 * </p>
 * <p>@package      : com.zixieqing.channel</p>
 * <p>@author       : ZiXieqing</p>
 */

public class AliPay extends AbstractPayWay{

    private Logger logger = LoggerFactory.getLogger(AliPay.class);

    public AliPay(IPayMode iPayMode) {
        super(iPayMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("模拟支付宝渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
        boolean check = iPayMode.check(uId);
        logger.info("模拟支付宝渠道支付风控校验。uId：{} tradeId：{} security：{}", uId, tradeId, check);
        if (!check) {
            logger.info("模拟支付宝渠道支付划账拦截。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            return "0001";
        }
        logger.info("模拟支付宝渠道支付划账成功。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
        return "0000";
    }
}
