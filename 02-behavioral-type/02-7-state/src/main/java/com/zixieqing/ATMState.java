package com.zixieqing;

/**
 * <p>@description  : 该类功能  抽象状态：ATM状态对应的行为
 * 封装与Context状态所属者的状态 / 属性相关的行为
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface ATMState {
    /**
     * 插卡
     */
    void insertCard();

    /**
     * 提交密码
     */
    void submitPwd();

    /**
     * 取款
     */
    void getCash();

    /**
     * 查询余额
     */
    void queryBalance();

    /**
     * 退卡
     */
    void checkOut();
}
