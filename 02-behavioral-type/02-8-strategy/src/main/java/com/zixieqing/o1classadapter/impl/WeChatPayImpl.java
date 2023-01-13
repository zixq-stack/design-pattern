package com.zixieqing.o1classadapter.impl;

import com.zixieqing.PayStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  具体策略：微信支付方式
 * </p>
 * <p>@package      : com.zixieqing.o1class$adapter.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class WeChatPayImpl implements PayStrategy {

    private Logger logger = LoggerFactory.getLogger(WeChatPayImpl.class);

    @Override
    public void pay() {
        logger.info("本微信系统：收到商户平台中传来的 创建订单请求");
        logger.info("本微信系统：正在创建 预付单");
        logger.info("本微信系统：预付单生成成功：返回商户平台预付单标识");

        logger.info("这中间就是商户平台生成带签名的支付信息、用户发起支付请求、商户平台找微信客户端调起微信支付");

        logger.info("本微信系统：收到微信客户端(即：微信APP)发起的支付请求，开始验证支付授权权限");
        logger.info("本微信系统：给微信客户端返回支付授权");

        logger.info("用户：确认支付、输入密码，即提交授权给本微信支付系统");

        logger.info("本微信系统：正在验证支付授权");

        logger.info("本微信系统：异步通知商户平台：支付结果");

        logger.info("商户平台：保存支付通知，并返回本微信支付系统成功接收、处理与否");

        logger.info("本微信系统：给微信客户端返回支付结果，并发微信消息提醒（即：微信中的那个微信支付的消息）");

        logger.info("最后就是另外的一堆逻辑处理情况");
    }
}
