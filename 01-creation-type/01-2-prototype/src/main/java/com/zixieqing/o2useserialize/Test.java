package com.zixieqing.o2useserialize;

import com.zixieqing.o1useclone.Person;

import java.io.*;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing.o2useserialize</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Test {

    public static void main(String[] args) throws IOException {

        Person3 person3 = new Person3(0, new Person("紫邪情"));
        Person3 cloneInstance = cloneInstance(person3);

        System.out.println(person3);
        System.out.println(cloneInstance);

        cloneInstance.setSex(1);

        System.out.println("===========修改之后=============");

        System.out.println(person3);
        System.out.println(cloneInstance);
    }


    /**
     * <p>@description  : 该方法功能 对象序列化克隆
     * </p>
     * <p>@methodName   : cloneInstance</p>
     * <p>@author: ZiXieqing</p>
     * @param person3 要进行序列化克隆的对象
     * @return com.zixieqing.o2useserialize.Person3
     */
    private static Person3 cloneInstance(Person3 person3) throws IOException {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis;
        ObjectInputStream ois;
        Person3 person = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(person3);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            person = (Person3) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != bos) bos.close();

            if (null != oos) oos.close();
        }

        return person;
    }
}
