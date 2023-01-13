package com.zixieqing.o1derive;

import com.zixieqing.o1derive.impl.Name;

/**
 * <p>@description  : 该类功能  抽象访问者：提供能够访问所有元素(原来类中属性)的方法
 * </p>
 * <p>@package      : com.zixieqing.o1derive</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface Visitor {

    /**
     * 访问原有类的name属性 / 访问name元素
     *      要是还有其他的就继续加 如：sex........
     * @param name 要访问的元素
     */
    void visit(Name name);
}
