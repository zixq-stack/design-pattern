package com.zixieqing.o1derive;

/**
 * <p>@description  : 该类功能  抽象元素：把原有对象的所有属性 进行 抽象化
 *                      1、接收访问者访问的方法
 * </p>
 * <p>@package      : com.zixieqing.o1derive</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface People {

    /**
     * 接收访问者访问的方法   方法名不一定是这个，
     *  根据对要进行不同且不相关操作的属性操作的抽象化命名即可
     * @param visitor 访问者
     */
    void accept(Visitor visitor);
}
