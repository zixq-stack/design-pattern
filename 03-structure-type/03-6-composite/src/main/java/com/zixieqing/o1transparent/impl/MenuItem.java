package com.zixieqing.o1transparent.impl;

import com.zixieqing.o1transparent.MenuComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  透明式组合模式：树叶角色 个体对象
 * 一个个的个体对象 组成 组合对象
 * 定义组合对象的原始对象的行为
 * 此对象没有下级的子对象，因此：add、remove、getChild管理下级子对象的方法不支持
 * </p>
 * <p>@package      : com.zixieqing.o1transparent.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class MenuItem extends MenuComponent {

    private Logger logger = LoggerFactory.getLogger(MenuItem.class);

    /**
     * 菜单项的名字
     */
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    /**
     * 菜单或菜单项的名字
     *
     * @return String
     */
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        logger.info("{}",getName());
    }
}
