package com.zixieqing;

import com.zixieqing.o1simple.Iterator;
import com.zixieqing.o1simple.NewList;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {

    public static void main(String[] args) {
        NewList<Integer> newList = new NewList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);

        Iterator<Integer> iterator = newList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
