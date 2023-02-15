package com.zixieqing;

import com.zixieqing.o1simple.AbstractFlyweight;
import com.zixieqing.o1simple.FlyweightFactory;
import com.zixieqing.o2composite.CompositeFlyweightFactory;
import com.zixieqing.o2composite.Flyweight;
import org.junit.Test;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {

    @Test
    public void simpleFlyweightTest() {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        AbstractFlyweight abstractFlyweight_a = flyweightFactory.factory(new Character('a'));
        System.out.println(abstractFlyweight_a.hashCode());
        // 由客户端以参数的形式传入外蕴状态
        abstractFlyweight_a.operation('紫');

        AbstractFlyweight abstractFlyweight_b = flyweightFactory.factory(new Character('b'));
        System.out.println(abstractFlyweight_b.hashCode());
        abstractFlyweight_b.operation('邪');

        AbstractFlyweight abstractFlyweight_c = flyweightFactory.factory(new Character('a'));
        System.out.println(abstractFlyweight_c.hashCode());
        abstractFlyweight_c.operation('紫');
    }

    @Test
    public void compositeFlyweightTest() {
        CompositeFlyweightFactory compositeFlyweightFactory = CompositeFlyweightFactory.getInstance();
        Flyweight simpleFlyweight_a = compositeFlyweightFactory.simpleFlyweightFactory("紫邪情");
        Flyweight compositeFlyweight = compositeFlyweightFactory.compositeFlyweightFactory("紫明轩");

        simpleFlyweight_a.operation("ZiXieqing");
        compositeFlyweight.operation("ZiMingxuan");

        Flyweight simpleFlyweight_b = compositeFlyweightFactory.simpleFlyweightFactory("紫邪情");
        simpleFlyweight_b.operation("ZiXieqing");
    }
}
