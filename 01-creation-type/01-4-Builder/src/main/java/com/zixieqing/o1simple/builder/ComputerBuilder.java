package com.zixieqing.o1simple.builder;

import com.zixieqing.o1simple.Computer;

/**
 * <p>@description  : 该类功能  具体建造者：干活的员工
 * </p>
 * <p>@package      : com.zixieqing.o1simple.builder</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ComputerBuilder implements IComputerBuilder{

    /**
     * 组合产品对象
     */
    private Computer computer = new Computer();


    /**
     * 产品对象零部件：建造主机
     */
    @Override
    public ComputerBuilder buildHost() {
        computer.setHost("主机配置");
      /*
        返回this就是成为链式调用的关键，如：
        computerBuilder.buildMonitor()
                        .buildHost()
                        .buildExtendMap()
                        .getComputer();
      */
        return this;
    }

    /**
     * 产品对象零部件：显示器类型
     */
    @Override
    public ComputerBuilder buildMonitor() {
        computer.setMonitor("显示器类型");
        return this;
    }

    /**
     * 产品对象零部件：额外信息
     */
    @Override
    public ComputerBuilder buildExtendMap() {
        computer.setExtendMap("额外信息");
        return this;
    }

    /**
     * 返回构建好的复杂对象 / 产品对象
     */
    @Override
    public Computer getComputer() {
        return computer;
    }
}
