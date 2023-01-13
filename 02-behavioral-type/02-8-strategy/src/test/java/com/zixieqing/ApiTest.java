package com.zixieqing;

import com.zixieqing.o1classadapter.impl.AliPayImpl;
import com.zixieqing.o1classadapter.impl.WeChatPayImpl;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {
    public static void main(String[] args) {

        PayContext payContext = new PayContext(new WeChatPayImpl());
        payContext.pay();

        System.out.println("==================华丽的分隔符====================");

        PayContext payContext1 = new PayContext(new AliPayImpl());
        payContext1.pay();

    }
}
