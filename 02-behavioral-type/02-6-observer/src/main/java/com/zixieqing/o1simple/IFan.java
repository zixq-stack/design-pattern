package com.zixieqing.o1simple;

/**
 * <p>@description  : 该类功能  粉丝接口：抽象观察者 得到通知之后，更新自身相关数据 / 做自己要做的事情
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public abstract class IFan {

    public abstract boolean response(Article article);
}
