package com.zixieqing.o3abstractfactory.o1simple.impl;

import com.zixieqing.o3abstractfactory.o1simple.IChair;

/**
 * <p>@description  : 该类功能  具体产品：塑料桌子
 * </p>
 * <p>@package      : com.zixieqing.o3abstractfactory.o1simple.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class PlasticChair implements IChair {
    @Override
    public String createChair() {
        return "塑料椅子";
    }
}
