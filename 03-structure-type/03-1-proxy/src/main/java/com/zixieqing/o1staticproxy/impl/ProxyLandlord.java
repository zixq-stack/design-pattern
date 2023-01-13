package com.zixieqing.o1staticproxy.impl;

import com.zixieqing.o1staticproxy.IHouse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  代理角色：
 *                      代理真实角色，间接访问真实角色，从而限制、增强、修改真是角色的一些特性
 * </p>
 * <p>@package      : com.zixieqing.o1staticproxy.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ProxyLandlord implements IHouse {

    private Logger logger = LoggerFactory.getLogger(ProxyLandlord.class);

    /**
     * 目标：真实角色
     */
    private IHouse target;

    public ProxyLandlord(IHouse target) {
        this.target = target;
    }

    /**
     * 需求：在执行真实角色方法执行，统计耗时时长，从而提交到监控系统中让其使用
     */
    @Override
    public void rent() {
        long startTime = System.currentTimeMillis();

        // 执行真实角色中的方法
        target.rent();

        long endTime = System.currentTimeMillis();

        logger.info("耗时：{} 毫秒", (endTime - startTime));

        foo();
    }

    // 以下即为代理角色特有的一些操作：看房子、签合同、收费、交钱给房东........


    private void foo() {
        logger.info("中介者还可以吃喝嫖赌............");
    }
}
