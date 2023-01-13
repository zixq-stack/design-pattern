package com.zixieqing.command;

import com.zixieqing.Food;

import java.util.List;

/**
 * <p>@description  : 该类功能  厨师
 * </p>
 * <p>@package      : com.zixieqing.command</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface IChef {

    Food cook(List<String> foodList);
}
