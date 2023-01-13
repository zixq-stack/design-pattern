package com.zixieqing.o1transparent.impl;

import com.zixieqing.o1transparent.MenuComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>@description  : 该类功能  透明式组合模式：树枝角色
 * 此角色有下级的子对象，因此：有管理下级子对象的add、remove、getChild方法
 * </p>
 * <p>@package      : com.zixieqing.o1transparent.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Menu extends MenuComponent {

    private Logger logger = LoggerFactory.getLogger(Menu.class);

    private List<MenuComponent> menuComponents = new ArrayList<>();

    /**
     * 菜单的名字
     */
    private String name;

    public Menu(String name) {
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
    public boolean add(MenuComponent menuComponent) {
        return this.menuComponents.add(menuComponent);
    }

    @Override
    public boolean remove(MenuComponent menuComponent) {
        return this.menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return this.menuComponents.get(i);
    }

    @Override
    public void print() {
        logger.info("{}", getName());

        Iterator<MenuComponent> componentIterator = this.menuComponents.iterator();
        while (componentIterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)componentIterator.next();
            menuComponent.print();
        }
    }
}
