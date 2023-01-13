package com.zixieqing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  抽象模板
 *                      1、定义模板方法    制定要做的这件事的算法结构
 *                      2、封装公有部分 实现其逻辑
 *                      3、抽象非公有部分 等着子类来实现逻辑
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public abstract class AbstractSoyMilk {

    private Logger logger = LoggerFactory.getLogger(AbstractSoyMilk.class);

    /**
     * 模板方法：制定"算法"结构
     */
    protected final void make() {
        // 1、选择原料
        choose();
        // 2、添加调料
        add();
        // 3、浸泡
        soak();
        // 4、打碎
        smashed();
    }

    /**
     * 添加调料：非公有逻辑交由子类来实现
     */
    protected abstract void add();

    /**
     * 选择原料：封装公有部分
     */
    protected void choose() {
        logger.info("{} 正在准备添加原料 ",this.getClass().getSimpleName());

        logger.info("正在选择原料");
    }

    /**
     * 浸泡：封装公有部分
     */
    protected void soak() {
        logger.info("{} 正在准备添加原料 ",this.getClass().getSimpleName());

        logger.info("正在进行浸泡！");
    }

    /**
     * 打碎：封装公有部分
     */
    protected void smashed() {
        logger.info("{} 正在准备添加原料 ",this.getClass().getSimpleName());

        logger.info("正在进行打碎");
    }
}
