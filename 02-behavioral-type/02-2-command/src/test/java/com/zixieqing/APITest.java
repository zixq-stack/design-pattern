package com.zixieqing;

import com.zixieqing.command.Waiter;
import com.zixieqing.command.impl.ChaoCaiMenuImpl;
import com.zixieqing.command.impl.HuoGuoMenuImpl;
import com.zixieqing.command.impl.LiChefImpl;
import com.zixieqing.command.impl.ZhangChefImpl;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class APITest {

    public static void main(String[] args) {

        System.out.println(MenuEnum.YU_XIANG_ROU_SI.getFoodName());
        System.out.println(MenuEnum.YU_XIANG_ROU_SI.getPrice());

        System.out.println("==========华丽的分隔符==========");

        System.out.println(MenuEnum.YUAN_YANG_GUO.getFoodName());
        System.out.println(MenuEnum.YUAN_YANG_GUO.getPrice());

        System.out.println("==========华丽的分隔符==========");

        MenuEnum[] values = MenuEnum.values();
        for (MenuEnum value : values) {
            System.out.println(value.getFoodName());
        }


        System.out.println("==========华丽的分隔符==========");


        Waiter waiter = new Waiter(new HuoGuoMenuImpl(new ZhangChefImpl()));

        // 点单
        waiter.order("鸳鸯锅");

        // 下单
        waiter.placeOrder();

        System.out.println("==========华丽的分隔符==========");

        Waiter newWaiter = new Waiter(new ChaoCaiMenuImpl(new LiChefImpl()));

        // 点单
        newWaiter.order("鱼香肉丝");

        // 下单
        newWaiter.placeOrder();
    }
}
