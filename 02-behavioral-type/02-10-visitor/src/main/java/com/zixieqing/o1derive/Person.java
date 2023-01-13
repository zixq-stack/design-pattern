package com.zixieqing.o1derive;

import lombok.Data;

/**
 * <p>@description  : 该类功能  理解访问者模式中所谓的原有的数据结构
 * </p>
 * <p>@package      : com.zixieqing.o1derive</p>
 * <p>@author       : ZiXieqing</p>
 */


@Data
public class Person {

    private String name;

}


class Test{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("紫邪情");

        System.out.println(person.getName());
    }
}
