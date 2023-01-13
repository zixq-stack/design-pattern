package com.zixieqing;

import com.zixieqing.channel.AliPay;
import com.zixieqing.channel.WeChatPay;
import com.zixieqing.mode.FingerprintCheckImpl;
import com.zixieqing.mode.PwdCheckImpl;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {

    @Test
    public void MyTest() {

        // 1、微信+密码=支付
        WeChatPay weChatPay = new WeChatPay(new PwdCheckImpl());
        weChatPay.transfer("weixin-".concat(UUID.randomUUID().toString()),
                    System.nanoTime() + "",
                            new BigDecimal(1000));

        System.out.println();

        // 2、支付宝+指纹=支付
        AliPay aliPay = new AliPay(new FingerprintCheckImpl());
        aliPay.transfer("zfb-".concat(UUID.randomUUID().toString()),
                System.nanoTime() + "",
                new BigDecimal(1000));
    }
}
