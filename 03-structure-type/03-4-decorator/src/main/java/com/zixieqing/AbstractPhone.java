package com.zixieqing;

/**
 * <p>@description  : 该类功能  抽象组件：电话
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface AbstractPhone {

    /**
     * 基本功能：通话
     * @return 通话内容
     */
    String call();

    /**
     * 基本功能：发短信
     * @return 短信内容
     */
    String sendMessage();
}
