package com.zixieqing;

import com.zixieqing.decorator.impl.PhoneImplDecorator;
import com.zixieqing.impl.PhoneImpl;
import org.junit.Test;


/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {

    @Test
    public void decoratorTest() {
        // 没有装饰器的情况下
        PhoneImpl phone = new PhoneImpl();
        System.out.println(phone.call());
        System.out.println(phone.sendMessage());
        System.out.println("==============华丽的分隔符==============");

        PhoneImplDecorator phoneImplDecorator = new PhoneImplDecorator(phone);
        System.out.println(phoneImplDecorator.call());
        System.out.println(phoneImplDecorator.sendMessage());
        // 扩展
        phoneImplDecorator.watchTV();
    }
}
