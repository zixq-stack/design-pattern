package com.zixieqing.o1simple.impl;

import com.zixieqing.o1simple.Iterator;

import java.util.List;

/**
 * <p>@description  : 该类功能  具体迭代器
 * </p>
 * <p>@package      : com.zixieqing.o1simple.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class IteratorImpl<E> implements Iterator<E> {

    /**
     * 下一个元素的索引
     */
    private int cursor;

    /**
     * 最后一个元素的索引，如果没有就返回-1
     */
    private int lastRet = -1;

    private List<E> list;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return this.cursor < list.size();
    }

    @Override
    public E next() {
        return this.list.get(cursor++);
    }
}
