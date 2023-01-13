package com.zixieqing.o1transparent;

/**
 * <p>@description  : 该类功能  透明式组合模式：抽象组件
 * 定义出树叶组件和数纸组件共同遵守的约定
 * </p>
 * <p>@package      : com.zixieqing.o1transparent</p>
 * <p>@author       : ZiXieqing</p>
 */

public abstract class MenuComponent {
    /**
     * 菜单或菜单项的名字
     * @return String
     */
    public abstract String getName();

    /**
     * 添加下级子菜单
     * @param menuComponent 要添加的子菜单组件
     * @return boolean
     */
    public boolean add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 删除下级子菜单项
     * @param menuComponent 要删除的子菜单组件
     * @return boolean
     */
    public boolean remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取子菜单项
     * @param i 第i个子菜单
     * @return MenuComponent
     */
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * 打印菜单
     */
    public abstract void print();
}
