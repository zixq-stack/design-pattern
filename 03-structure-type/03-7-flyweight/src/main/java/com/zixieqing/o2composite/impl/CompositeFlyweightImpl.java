package com.zixieqing.o2composite.impl;

import com.zixieqing.o2composite.Flyweight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>@description  : 该类功能  复合亨元模式：复合亨元角色 类似组合模式中的树枝角色
 *  又叫不可共享亨元对象， 此角色所代表的的对象时不可以共享的，但一个复合亨元对象可以分解为多个单纯亨元对象
 *  复合亨元对象是由单纯亨元对象（FlyweightImpl）组合而来，所以复合亨元对象可以也具有add、remove方法
 *  一个复合亨元对象中的所有单纯亨元对象的外蕴状态 和 复合亨元对象的外蕴状态是相等的
 *  但：一个复合亨元对象中的单纯亨元对象（FlyweightImpl）彼此之间的内蕴状态不同，不然没意义了
 * </p>
 * <p>@package      : com.zixieqing.o2composite.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class CompositeFlyweightImpl extends Flyweight {

    private Logger logger = LoggerFactory.getLogger(CompositeFlyweightImpl.class);

    /**
     * Flyweight实例容器
     */
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    /**
     * 添加Flyweight实例
     * @param key 键
     * @param value 值
     */
    public void addFlyweight(String key, Flyweight value) {
        flyweightMap.put(key, value);
    }

    /**
     * 业务操作方法
     *
     * @param externalState 外蕴状态
     */
    @Override
    public void operation(String externalState) {
        logger.info("进入了 {} ", this.getClass().getSimpleName());
        Flyweight flyweightInstance;
        for (Map.Entry<String, Flyweight> characterFlyweightEntry : flyweightMap.entrySet()) {
            flyweightInstance = characterFlyweightEntry.getValue();
            flyweightInstance.operation(externalState);
        }
    }
}
