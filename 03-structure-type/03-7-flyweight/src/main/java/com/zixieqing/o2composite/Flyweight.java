package com.zixieqing.o2composite;

/**
 * <p>@description  : 该类功能  复合亨元模式：抽象亨元角色
 *  制定出需要实现的公共接口
 *  需要外蕴状态的操作可以通过调用业务方法以参数传入
 *  可以做到：并不是所有的亨元对象都是可以共享的，在具体亨元类中做处理即可
 * </p>
 * <p>@package      : com.zixieqing.o2composite</p>
 * <p>@author       : ZiXieqing</p>
 */

public abstract class Flyweight {
    /**
     * 业务操作方法
     * @param externalState 外蕴状态
     */
    public abstract void operation(String externalState);
}