package com.zixieqing.decorator;

import com.zixieqing.AbstractPhone;

/**
 * <p>@description  : 该类功能  抽象装饰器：对具体组件进行扩展
 * </p>
 * <p>@package      : com.zixieqing.decorator</p>
 * <p>@author       : ZiXieqing</p>
 */

public abstract class AbstractPhoneDecorator implements AbstractPhone{

    /**
     * 聚合抽象组件
     *    如果这个类中只有一个方法的话，可以直接把抽象组件引用做参数传递，参考：Spring的BeanDefinitionDecorator
     *    也可以根据情况选择耦合度更强一点的组合，看实际情况即可，只要这个抽象装饰器中有抽象组件的引用即可，设计模式不是一层不变的
     */
    protected AbstractPhone abstractPhone;

    public AbstractPhoneDecorator(AbstractPhone abstractPhone) {
        this.abstractPhone = abstractPhone;
    }


    /**
     * 基本功能：通话
     *
     * @return 通话内容
     */
    @Override
    public String call() {
        return this.abstractPhone.call();
    }

    /**
     * 基本功能：发短信
     *
     * @return 短信内容
     */
    @Override
    public String sendMessage() {
        return this.abstractPhone.sendMessage();
    }

    /**
     * 扩展功能：看电视
     */
    public abstract void watchTV();
}
