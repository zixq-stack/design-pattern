package com.zixieqing;

import com.zixieqing.handler.OneHakimHandler;
import com.zixieqing.handler.TwoHakimHandler;

/**
 * <p>@description  : 该类功能  客户端：这部分的代码可以封装起来，然后提供一个公共方法给外部调用即可
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class APITest {

    public static void main(String[] args) {

        // 创建处理链 并 将请求丢给链头的处理者
        OneHakimHandler handler1 = new OneHakimHandler();
        handler1.setNext(new TwoHakimHandler());

        System.out.println(handler1.hakim("LISI"));

        System.out.println("============华丽的分隔符=============");

        System.out.println(handler1.hakim("ZIXIEQING"));

        System.out.println("============华丽的分隔符=============");

        System.out.println(handler1.hakim("zimingxuan"));
    }
}
