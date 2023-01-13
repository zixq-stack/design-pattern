package com.zixieqing;

import com.zixieqing.o1simple.ConcreteCoordinator;
import com.zixieqing.o1simple.Coordinator;
import com.zixieqing.o1simple.Man;
import com.zixieqing.o1simple.Woman;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {

    public static void main(String[] args) {

        Coordinator connrdinator = new ConcreteCoordinator();

        Woman woman = new Woman(connrdinator);
        // 同事类的独有方法
        woman.shopping();

        Man man = new Man(connrdinator);
        // 同事类独有方法
        man.eat("闭门羹");
        man.drink("寂寞");
        man.cook("空气");

        // 提供给外部，进行协调的方法
        woman.talkToFriend("");
        // 提供给外部，进行协调的方法
        man.love("");
    }
}
