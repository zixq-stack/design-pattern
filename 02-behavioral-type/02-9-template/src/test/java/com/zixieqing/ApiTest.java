package com.zixieqing;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {

    public static void main(String[] args) {
        // 红豆型豆浆
        AbstractSoyMilk redBeans = new RedBeans();
        redBeans.make();

        System.out.println("=====================华丽的分隔符==================");

        // 绿豆型豆浆
        AbstractSoyMilk greenBeans = new GreenBeans();
        greenBeans.make();
    }
}
