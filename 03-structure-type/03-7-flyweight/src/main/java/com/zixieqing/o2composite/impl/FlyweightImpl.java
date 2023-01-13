package com.zixieqing.o2composite.impl;

import com.zixieqing.o2composite.Flyweight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  复合亨元模式：具体亨元角色  又叫单纯具体亨元角色
 * 相当于合成模式中的树叶角色
 * </p>
 * <p>@package      : com.zixieqing.o2composite.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class FlyweightImpl extends Flyweight {

    private Logger logger = LoggerFactory.getLogger(FlyweightImpl.class);

    /**
     * 内蕴状态
     */
    private String internalState;

    public FlyweightImpl(String internalState) {
        this.internalState = internalState;
    }

    /**
     * 业务操作方法
     *
     * @param externalState 外蕴状态
     */
    @Override
    public void operation(String externalState) {
        logger.info("进入了 {} 类", this.getClass().getSimpleName());
        logger.info("{} 的内蕴状态为：{}，hashcode为：{}",
                this.getClass().getSimpleName(),
                this.internalState,
                this.internalState.hashCode());
        logger.info("{} 的外蕴状态为：{}，hashcode为：{}",
                this.getClass().getSimpleName(),
                externalState,
                externalState.hashCode());
    }
}
