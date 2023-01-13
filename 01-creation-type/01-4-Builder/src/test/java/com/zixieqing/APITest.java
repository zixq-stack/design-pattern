package com.zixieqing;

import com.zixieqing.o1simple.Computer;
import com.zixieqing.o1simple.builder.ComputerBuilder;
import com.zixieqing.o1simple.builder.ComputerDirector;
import com.zixieqing.o1simple.builder.IComputerBuilder;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class APITest {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("张三")
                .append("李四")
                .append("大刀王五")
                .append("王麻子");


        System.out.println(builder);


        System.out.println("===============华丽的分隔符=================");

        System.out.println(ComputerDirector.getComputer());

        System.out.println("===============华丽的分隔符=================");


        IComputerBuilder computerBuilder = new ComputerBuilder();

        Computer computer = computerBuilder.buildHost()
                .buildExtendMap()
                .buildMonitor()
                .getComputer();

        System.out.println(computer);
    }
}
