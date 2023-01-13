package com.zixieqing;

import com.zixieqing.o1simple.Memento;
import com.zixieqing.o1simple.Orginal;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {

    public static void main(String[] args) {

        // 要进行保存的对象
        Orginal orginal = new Orginal();
        orginal.setField("稀里哗啦保存了一堆的东西");

        // 将对象的当前时刻的内部信息保存到备忘录中
        Memento memento = orginal.saveToMemento();

        System.out.println(orginal);

        // 模拟
        orginal.setField("噼里啪啦又是一顿操作，保存了数据");
        System.out.println(orginal);

        System.out.println("=============芜湖~断电咯================");
        System.out.println("。。。。。。。。。。。。。。。。。。。。");
        System.out.println("=============耶吼~电力恢复啦=============");

        // 从记录的备忘录中恢复对象内部状态
        orginal.rollbackFromMemento(memento);

        System.out.println("=============对象恢复之后的状态===========");
        System.out.println(orginal);
    }
}
