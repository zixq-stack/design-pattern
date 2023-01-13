package com.zixieqing.o2composite;

import com.zixieqing.o2composite.impl.CompositeFlyweightImpl;
import com.zixieqing.o2composite.impl.FlyweightImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>@description  : 该类功能  复合亨元模式：亨元工厂  一样还是单例 负责创建于管理亨元角色
 * 此角色必须保证亨元对象可以被系统适当地共享
 * 当一个客户端对象调用一个亨元对象时，亨元工厂会检查系统中是否已经有一个符合要求的亨元对象，
 *     若有则提供这个已有的亨元对象，若无则亨元工厂应创建一个合适的亨元对象
 * </p>
 * <p>@package      : com.zixieqing.o2composite</p>
 * <p>@author       : ZiXieqing</p>
 */

public class CompositeFlyweightFactory {

    private Logger logger = LoggerFactory.getLogger(CompositeFlyweightFactory.class);

    private static volatile CompositeFlyweightFactory INSTANCE;

    /**
     * 装单纯亨元对象 和 复合亨元对象的容器
     */
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    /**
     * 获取单纯亨元对象
     * @param externalState 外蕴状态
     * @return Flyweight
     */
    public Flyweight simpleFlyweightFactory(String externalState) {
        logger.info("进入 {} 的 compositeFlyweightFactory 方法", this.getClass().getSimpleName());

        if (flyweightMap.containsKey(externalState)) return flyweightMap.get(externalState);

        FlyweightImpl flyweight = new FlyweightImpl(externalState);
        flyweightMap.put(externalState, flyweight);
        return flyweight;
    }

    /**
     * 获取复合亨元对象
     * @param externalState 外蕴状态
     * @return Flyweight
     */
    public Flyweight compositeFlyweightFactory(String externalState) {
        logger.info("进入 {} 的 compositeFlyweightFactory 方法", this.getClass().getSimpleName());

        CompositeFlyweightImpl compositeFlyweight = new CompositeFlyweightImpl();
        compositeFlyweight.addFlyweight(externalState, this.simpleFlyweightFactory(externalState));
        return compositeFlyweight;
    }

    private CompositeFlyweightFactory() {
    }

    /**
     * 获取工厂实例
     * @return CompositeFlyweightFactory
     */
    public static CompositeFlyweightFactory getInstance() {
        if (null != INSTANCE) return INSTANCE;

        synchronized (CompositeFlyweightFactory.class) {
            if (null == INSTANCE) {
                INSTANCE = new CompositeFlyweightFactory();
            }
        }

        return INSTANCE;
    }
}
