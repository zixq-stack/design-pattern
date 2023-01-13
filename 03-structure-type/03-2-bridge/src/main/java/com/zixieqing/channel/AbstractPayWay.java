package com.zixieqing.channel;

import com.zixieqing.mode.IPayMode;

import java.math.BigDecimal;

/**
 * <p>@description  : 该类功能  抽象化角色：聚合一个具体化对象引用
 * </p>
 * <p>@package      : com.zixieqing.channel</p>
 * <p>@author       : ZiXieqing</p>
 */

public abstract class AbstractPayWay {

    /**
     * 聚合支付模式
     */
    protected IPayMode iPayMode;

    protected AbstractPayWay(IPayMode iPayMode) {
        this.iPayMode = iPayMode;
    }

    /**
     * 支付方式
     *      如果直接采用if-else，那实现类中这里直接if判断是支付宝还是微信，里面又继续判断是密码、人脸、指纹...，之后做逻辑即可
     *      而：采用桥接模式进行桥街点拆分之后，抽象（AbstractPayWay）依赖实现（IPayMode），想要什么组合按照自己需要即可
     *      这样就让抽象和实现都可以独立使用和变化
     * @param uId 用户ID
     * @param tradeId 交易ID
     * @param amount 金额
     * @return 受理情况
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
