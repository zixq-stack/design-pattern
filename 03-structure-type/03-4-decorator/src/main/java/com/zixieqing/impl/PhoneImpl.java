package com.zixieqing.impl;

import com.zixieqing.AbstractPhone;

/**
 * <p>@description  : 该类功能  具体组件：实现抽象组件的行为
 * </p>
 * <p>@package      : com.zixieqing.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class PhoneImpl implements AbstractPhone {
    /**
     * 基本功能：通话
     *
     * @return 通话内容
     */
    @Override
    public String call() {
        return "电话基本功能：进行通话";
    }

    /**
     * 基本功能：发短信
     *
     * @return 短信内容
     */
    @Override
    public String sendMessage() {
        return "电话基本功能：发短信";
    }
}
