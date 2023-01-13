package com.zixieqing;

import com.zixieqing.o1transparent.MenuComponent;
import com.zixieqing.o1transparent.impl.Menu;
import com.zixieqing.o1transparent.impl.MenuItem;
import org.junit.Test;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {

    @Test
    public void transparentTest() {
        /*
        * 构建树形结构
        *            开发用户手册
        *              /   \
        *        管理             运维服务
        *         |                 |
        *      日志记录         数据同步    DB维护    资产申报    DB主机容器管理
        * */

        MenuComponent userManualMenu = new Menu("开发用户手册");
        MenuComponent manageMenu = new Menu("管理");
        MenuComponent devOpsServiceMenu = new Menu("运维服务");

        userManualMenu.add(manageMenu);
        userManualMenu.add(devOpsServiceMenu);
        manageMenu.add(new MenuItem("日志记录"));
        devOpsServiceMenu.add(new MenuItem("数据同步"));
        devOpsServiceMenu.add(new MenuItem("DB维护"));
        devOpsServiceMenu.add(new MenuItem("资产申报"));
        devOpsServiceMenu.add(new MenuItem("DB主机容器管理"));

        userManualMenu.print();
    }
}
