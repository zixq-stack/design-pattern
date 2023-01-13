package com.zixieqing.o1useclone;


/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : MeiChengsong</p>
 */

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        /*
        Person person = new Person();
        person.setName("紫邪情");

        Person clonePerson = (Person) person.clone();
        System.out.println( "原型对象：" + person);
        System.out.println( "克隆对象：" + clonePerson);

        clonePerson.setName("小紫");

        System.out.println("==========修改之后=============");
        System.out.println(person);
        System.out.println(clonePerson);
        */

        Peron2 peron2 = new Peron2();
        Person person = new Person("法外狂徒");
        peron2.setPerson(person);

        Peron2 clonePerson2 = (Peron2) peron2.clone();

        System.out.println(peron2);
        System.out.println(clonePerson2);

        person.setName("张三");
        clonePerson2.setPerson(person);

        System.out.println("修改之后");
        System.out.println(peron2);
        System.out.println(clonePerson2);
    }
}
