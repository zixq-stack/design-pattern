package com.zixieqing.command;

import java.util.List;

/**
 * <p>@description  : 该类功能  菜单：就是服务员在纸上写的哪些菜名，即：命令对象
 * </p>
 * <p>@package      : com.zixieqing.command</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface IMenu {

    void make(List<String> foodList);
}
