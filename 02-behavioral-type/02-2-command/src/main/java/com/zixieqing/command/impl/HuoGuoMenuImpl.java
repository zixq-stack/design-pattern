package com.zixieqing.command.impl;

import com.zixieqing.command.IChef;
import com.zixieqing.command.IMenu;

import java.util.List;

/**
 * <p>@description  : 该类功能  火锅类型的菜单
 * </p>
 * <p>@package      : com.zixieqing.command.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class HuoGuoMenuImpl implements IMenu {

    private IChef chef;

    public HuoGuoMenuImpl(IChef chef) {
        this.chef = chef;
    }

    @Override
    public void make(List<String> foodList) {
        chef.cook(foodList);
    }
}
