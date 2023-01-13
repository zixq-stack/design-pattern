package com.zixieqing.decorator.impl;

import com.zixieqing.AbstractPhone;
import com.zixieqing.decorator.AbstractPhoneDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  具体装饰器：不改变原有类（具体组件）的前提下，扩展其功能
 * </p>
 * <p>@package      : com.zixieqing.decorator.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class PhoneImplDecorator extends AbstractPhoneDecorator {

    private Logger logger = LoggerFactory.getLogger(PhoneImplDecorator.class);

    public PhoneImplDecorator(AbstractPhone abstractPhone) {
        super(abstractPhone);
    }

    /**
     * 扩展功能：看电视
     */
    @Override
    public void watchTV() {
        logger.info("正在观看：精钢葫芦娃");
    }
}
