package com.zixieqing.o1simple.builder;

import com.zixieqing.o1simple.Computer;

/**
 * <p>@description  : 该类功能  指挥者：拿图纸的工程师，负责产品对象的构建顺序
 * </p>
 * <p>@package      : com.zixieqing.o1simple.builder</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ComputerDirector {

    private static IComputerBuilder computerBuilder = new ComputerBuilder();

    public static Computer getComputer() {
        // 1、先搞显示器
        return computerBuilder.buildMonitor()
                // 在搞主机配置
                .buildHost()
                // 最后弄其他配置信息
                .buildExtendMap()
                .getComputer();
    }
}
