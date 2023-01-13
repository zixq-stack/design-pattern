package com.zixieqing.o1simple;

/**
 * <p>@description  : 该类功能  产品对象：电脑
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Computer {

    /**
     * 电脑主机
     */
    private String host;

    /**
     * 电脑显示器
     */
    private String monitor;

    /**
     * 扩展信息
     */
    private String extendMap;

    @Override
    public String toString() {
        return "Computer{" +
                "host='" + host + '\'' +
                ", monitor='" + monitor + '\'' +
                ", extendMap='" + extendMap + '\'' +
                '}';
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setExtendMap(String extendMap) {
        this.extendMap = extendMap;
    }
}
