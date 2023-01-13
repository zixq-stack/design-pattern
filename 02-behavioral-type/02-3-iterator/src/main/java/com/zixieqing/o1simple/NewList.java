package com.zixieqing.o1simple;

import com.zixieqing.o1simple.impl.IteratorImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@description  : 该类功能  具体容器
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public class NewList<E> implements ICollection<E> {

    private List<E> list = new ArrayList<>();

    @Override
    public Iterator<E> iterator() {
        return new IteratorImpl<>(list);
    }

    @Override
    public boolean add(E element) {
        return list.add(element);
    }
}
