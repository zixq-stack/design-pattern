package com.zixieqing.o1simple;

/**
 * <p>@description  : 该类功能  单纯亨元模式：抽象亨元角色
 *                    规定出需要实现的公共接口
 *                    外蕴状态以参数的形式传入
 *    外蕴状态：随环境的改变而改变，由客户端保存，在亨元对象创建之后，在需要时传入到亨元对象内部
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public abstract class AbstractFlyweight {

    /**
     * 业务操作方法
     * @param externalState 外蕴状态
     */
    public abstract void operation(Character externalState);
}