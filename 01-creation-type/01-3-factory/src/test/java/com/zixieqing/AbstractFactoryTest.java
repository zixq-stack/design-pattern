package com.zixieqing;

import com.zixieqing.o3abstractfactory.o1simple.factory.PlasticFurnitureFactory;
import com.zixieqing.o3abstractfactory.o1simple.factory.WoodenIFurnitureFactory;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class AbstractFactoryTest {

    public static void main(String[] args) {
        // 木质椅子
        String chair = new WoodenIFurnitureFactory().createChair().createChair();
        // 木质桌子
        String desk = new PlasticFurnitureFactory().createDesk().create();

        System.out.println(chair + "+" +desk);

        // 想要塑料家具这个产品簇的东西，就去找塑料家具工厂即可
    }
}
