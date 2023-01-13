package com.zixieqing.o3abstractfactory.o1simple.factory;

import com.zixieqing.o3abstractfactory.o1simple.IChair;
import com.zixieqing.o3abstractfactory.o1simple.IDesk;
import com.zixieqing.o3abstractfactory.o1simple.IFurnitureFactory;
import com.zixieqing.o3abstractfactory.o1simple.impl.PlasticChair;
import com.zixieqing.o3abstractfactory.o1simple.impl.PlastidDeck;

/**
 * <p>@description  : 该类功能  具体工厂：专门生产塑料家具这一产品簇需要的东西
 * </p>
 * <p>@package      : com.zixieqing.o3abstractfactory</p>
 * <p>@author       : ZiXieqing</p>
 */

public class PlasticFurnitureFactory implements IFurnitureFactory {
    @Override
    public IChair createChair() {
        return new PlasticChair();
    }

    @Override
    public IDesk createDesk() {
        return new PlastidDeck();
    }
}
