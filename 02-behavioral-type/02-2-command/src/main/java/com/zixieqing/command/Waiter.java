package com.zixieqing.command;

import com.zixieqing.MenuEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@description  : 该类功能  服务员
 * </p>
 * <p>@package      : com.zixieqing.command</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Waiter {

    private Logger logger = LoggerFactory.getLogger(Waiter.class);

    /**
     * 服务员本子上记的菜名
     */
    private List<String> foodList = new ArrayList<>();
    /**
     * 本店菜单
     */
    private MenuEnum[] values = MenuEnum.values();

    private IMenu menu;

    public Waiter(IMenu menu) {
        this.menu = menu;
    }

    /**
     * <p>@description  : 该方法功能 点单
     * </p>
     * <p>@methodName   : order</p>
     * <p>@author: ZiXieqing</p>
     * <p>@createTime: 2022-11-03 10:27</p>
     * <p>@version: V1.0.0</p>
     *
     * @param foodName 菜名
     */
    public void order(String foodName) {
        for (MenuEnum value : values) {
            // 判断客人所说的菜名是否在本店的菜单中
            if (foodName.trim().equals(value.getFoodName()))
                this.foodList.add(foodName);
        }
    }

    /**
     * <p>@description  : 该方法功能 下单
     * </p>
     * <p>@methodName   : placeOrder</p>
     * <p>@author: ZiXieqing</p>
     * <p>@createTime: 2022-11-03 9:54</p>
     * <p>@version: V1.0.0</p>
     */
    public void placeOrder() {
        menu.make(foodList);

        foodList.clear();
    }
}
