package com.zixieqing.o3abstractfactory.o1simple;

/**
 * <p>@description  : 该类功能  抽象工厂：家具工厂
 * </p>
 * <p>@package      : com.zixieqing.o3abstractfactory</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface IFurnitureFactory {

    IChair createChair();

    IDesk createDesk();
}
