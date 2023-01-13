package com.zixieqing.o1simple.builder;

import com.zixieqing.o1simple.Computer;

/**
 * <p>@description  : 该类功能  抽象建造者：老板 约束下级
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface IComputerBuilder {

    IComputerBuilder buildHost();

    IComputerBuilder buildMonitor();

    IComputerBuilder buildExtendMap();

    Computer getComputer();
}
