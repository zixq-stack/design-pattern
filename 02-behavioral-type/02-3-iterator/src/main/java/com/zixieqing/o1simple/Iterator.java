package com.zixieqing.o1simple;

/**
 * <p>@description  : 该类功能  抽象迭代器
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface Iterator<E> {

    boolean hasNext();

    E next();
}
