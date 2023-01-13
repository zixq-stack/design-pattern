package com.zixieqing.o1simple;

import com.zixieqing.o1simple.impl.ConcreteFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>@description  : 该类功能  单纯亨元模式：亨元工厂 负责创建和管理亨元角色
 *                      客户端调用此工厂进行亨元对象的创建
 *                      若是亨元对象需要外蕴状态的话，则由客户端调用此工厂时传入
 *                      会检查系统中是否已经有了符合要求的亨元对象，有则返回，没有则创建
 *                      此工厂在整个系统中是唯一的，因此：此工厂为单例模式
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public class FlyweightFactory {

    /**
     * 聚合抽象亨元角色
     */
    private AbstractFlyweight flyweight;

    /**
     * 用来存储亨元对象，可以采用其他的存储机制
     */
    private Map<Character, AbstractFlyweight> flyweightHashMap = new HashMap<>();

    private static volatile FlyweightFactory INSTANCE;

    /**
     * 创建亨元对象
     * @param internalState 内蕴状态：由客户端调用时以形参传入
     * @return 抽象亨元角色
     */
    public AbstractFlyweight factory(Character internalState) {

        if (flyweightHashMap.containsKey(internalState)) return flyweightHashMap.get(internalState);

        ConcreteFlyweight concreteFlyweight = new ConcreteFlyweight(internalState);
        flyweightHashMap.put(internalState, concreteFlyweight);
        return concreteFlyweight;
    }

    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        if (null != INSTANCE) return INSTANCE;

        synchronized (FlyweightFactory.class) {
            if (null == INSTANCE) return new FlyweightFactory();
        }

        return INSTANCE;
    }
}
