package com.zixieqing.o1simple.impl;

import com.zixieqing.o1simple.AbstractFlyweight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  单纯亨元模式：具体亨元角色
 * </p>
 * <p>@package      : com.zixieqing.o1simple.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ConcreteFlyweight extends AbstractFlyweight {

    private Logger logger = LoggerFactory.getLogger(ConcreteFlyweight.class);

    /**
     * 内蕴状态：存储在亨元对象内部，不会随着外部环境改变而改变
     * 可以进行共享，由客户端调用时以参数传入
     */
    private Character internalState;

    public ConcreteFlyweight(Character internalState) {
        this.internalState = internalState;
    }

    /**
     * 业务操作方法
     *
     * @param externalState 外蕴状态，不会随环境改变而改变，必须由客户端保存，客户端以参数形式传入
     */
    @Override
    public void operation(Character externalState) {
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
