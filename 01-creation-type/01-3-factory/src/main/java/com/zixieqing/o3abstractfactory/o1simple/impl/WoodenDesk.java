package com.zixieqing.o3abstractfactory.o1simple.impl;

import com.zixieqing.o3abstractfactory.o1simple.IDesk;

/**
 * <p>@description  : 该类功能  具体产品：木质桌子
 * </p>
 * <p>@package      : com.zixieqing.o3abstractfactory.o1simple.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class WoodenDesk implements IDesk {
    @Override
    public String create() {
        return "木质桌子";
    }
}
