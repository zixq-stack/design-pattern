package com.zixieqing;

/**
 * <p>@description  : 该类功能  上下文
 *                      1、负责调用者要做什么
 *                      2、在必要时可以存储具体策略的数据，在其需要时提供给它
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class PayContext {

    private PayStrategy payStrategy;

    /**
     * 调用者决定使用哪种方式
     * @param payStrategy 支付方式
     */
    public PayContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    /**
     * 负责调用者要做什么：支付
     */
    public void pay() {
        this.payStrategy.pay();
    }
}
