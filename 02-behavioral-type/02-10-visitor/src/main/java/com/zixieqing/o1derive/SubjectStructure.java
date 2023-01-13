package com.zixieqing.o1derive;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@description  : 该类功能  对象结构
 *                      1、添加元素 / 维护元素
 *                      2、让访问者能访问所有元素
 * </p>
 * <p>@package      : com.zixieqing.o1derive</p>
 * <p>@author       : ZiXieqing</p>
 */

public class SubjectStructure {

    private List<People> peoples = new ArrayList<>();

    /**
     * 添加元素
     * @param people 要添加的元素
     * @return true/false
     */
    public boolean addElement(People people) {
        return peoples.add(people);
    }

    /**
     * 让访问者能够访问所有元素
     * @param visitor 访问者
     */
    public void getPeoples(Visitor visitor) {
        for (People people : peoples) {
            people.accept(visitor);
        }
    }
}
