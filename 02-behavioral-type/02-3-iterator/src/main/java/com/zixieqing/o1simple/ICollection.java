package com.zixieqing.o1simple;

/**
 * <p>@description  : 该类功能  抽象容器
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface ICollection<E> {

    Iterator<E> iterator();

    boolean add(E element);
}
