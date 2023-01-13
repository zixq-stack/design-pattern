package com.zixieqing.o1simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * <p>@description  : 该类功能  男人：同事类A
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Man {

    private Logger logger = LoggerFactory.getLogger(Man.class);

    /**
     * 聚合协调者
     */
    private Coordinator coordinator;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 敏感词
     */
    private String filter = "不听，不听，分手";

    public Man(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    /**
     * 吃
     *
     * @param foodName 食物名
     */
    public void eat(String foodName) {
        logger.info("这个男人今天吃了：{}", foodName);
    }

    /**
     * 喝
     *
     * @param drinkName 饮料名
     */
    public void drink(String drinkName) {
        logger.info("这个男人刚刚喝了：{}", drinkName);
    }

    /**
     * 做饭
     *
     * @param foodName 菜名
     */
    public void cook(String foodName) {
        logger.info("这个男人正在做：{}", foodName);
    }

    /**
     * 谈恋爱
     *
     * @param thing 做的是恋爱中的什么事
     */
    public void love(String thing) {
        logger.info("女：{}", thing);
        if (thing.trim().equals(filter)) {
            ConcreteCoordinator.MSG_FLAG = 1;
            coordinator.handler(1, "你这娘们儿简直不可理喻，分就分");
        }

        ConcreteCoordinator.MSG_FLAG = 1;
        Scanner input = new Scanner(System.in);
        coordinator.handler(1, input.next());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
