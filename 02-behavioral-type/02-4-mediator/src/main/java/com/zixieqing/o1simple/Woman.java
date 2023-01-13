package com.zixieqing.o1simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * <p>@description  : 该类功能  女人：同事类B
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Woman {

    private Logger logger = LoggerFactory.getLogger(Woman.class);

    private Coordinator coordinator;

    private String name;

    private int age;

    /**
     * 火药桶
     */
    private String gunpowder = "你这娘们儿简直不可理喻，分就分";

    public Woman(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    /**
     * 逛街购物
     */
    public void shopping() {
        logger.info("这个仙女今天去哪里逛街，又买了xxxxxxxxxxx");
    }

    /**
     * 耍朋友
     */
    public void talkToFriend(String context) {
        logger.info("男：{}", context);
        // 如果触碰火药桶，那就退还物品
        if (context.trim().equals(gunpowder)) {
            logger.info("分就分，把他的破东西拿回去..........");
            ConcreteCoordinator.HANDOVER_FLAG = 2;
            ConcreteCoordinator.MSG_FLAG = 2;
            Scanner input = new Scanner(System.in);
            String goods = input.next();
            // 退还物品
            coordinator.handler(2, goods);
        }
        // 否则就是继续交流
        ConcreteCoordinator.MSG_FLAG = 2;
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
