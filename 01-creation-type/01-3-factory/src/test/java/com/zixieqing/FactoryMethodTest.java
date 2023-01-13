package com.zixieqing;

import com.zixieqing.o2factorymethod.factory.impl.JsonParseFactory;
import com.zixieqing.o2factorymethod.factory.impl.XMLParseFactory;

/**
 * <p>@description  : 该类功能  工厂方法模式测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class FactoryMethodTest {

    public static void main(String[] args) {

        // 需要json解析器
        String jsonParser = new JsonParseFactory().parse().parse();
        System.out.println(jsonParser);

        System.out.println();


        String xmlParser = new XMLParseFactory().parse().parse();
        System.out.println(xmlParser);


    }
}
