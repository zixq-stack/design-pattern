package com.zixieqing.handler;

import com.zixieqing.UsernameEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  第一个处理者
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class OneHakimHandler extends AbstractHakimHandler {

    private Logger logger = LoggerFactory.getLogger(OneHakimHandler.class);

    @Override
    public String hakim(String name) {
        logger.info("进入OneHakimHandler处理器");

        // 如果当前处理者能处理该请求，则进行处理，返回结果
        if (UsernameEnum.ZIXIEQING.toString().equals(name.trim().toUpperCase())) {
            return "欢迎：" + name + " 进入系统";
        }

        // 如果当前处理者不能处理改请求，则丢给后继者
        if (null != getNext())
            return getNext().hakim(name);

        return "没有处理者能够处理该请求";
    }
}
