package com.zixieqing.o3abstractfactory.o1simple.impl;

import com.zixieqing.o3abstractfactory.o1simple.IDesk;

/**
 * <p>@description  : 该类功能  具体产品：塑料桌子
 * </p>
 * <p>@package      : com.zixieqing.o3abstractfactory.o1simple.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class PlastidDeck implements IDesk {
    @Override
    public String create() {
        return "塑料桌子";
    }
}
