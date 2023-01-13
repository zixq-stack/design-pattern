package com.zixieqing.o3abstractfactory.o1simple.factory;

import com.zixieqing.o3abstractfactory.o1simple.IChair;
import com.zixieqing.o3abstractfactory.o1simple.IDesk;
import com.zixieqing.o3abstractfactory.o1simple.IFurnitureFactory;
import com.zixieqing.o3abstractfactory.o1simple.impl.WoodenChair;
import com.zixieqing.o3abstractfactory.o1simple.impl.WoodenDesk;

/**
 * <p>@description  : 该类功能  具体工厂：专门生产木质家具这一产品簇需要的东西
 * </p>
 * <p>@package      : com.zixieqing.o3abstractfactory.o1simple.factory</p>
 * <p>@author       : ZiXieqing</p>
 */

public class WoodenIFurnitureFactory implements IFurnitureFactory {
    @Override
    public IChair createChair() {
        return new WoodenChair();
    }

    @Override
    public IDesk createDesk() {
        return new WoodenDesk();
    }
}
