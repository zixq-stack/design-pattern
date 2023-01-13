package com.zixieqing;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {
    public static void main(String[] args) throws Exception {

        ATMContext atmContext = new ATMContext("123456", 300, 200000, 100000);

        System.out.println("===============初始状态===================");
        System.out.println(atmContext);

        atmContext.insertCard();
        atmContext.submitPwd();
        atmContext.getCash();
        atmContext.queryBalance();
        atmContext.checkOut();

        System.out.println("===============结束状态===================");
        System.out.println(atmContext);
    }
}
