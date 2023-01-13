package com.zixieqing.handler;

import com.zixieqing.UsernameEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  第二个处理者
 * </p>
 * <p>@package      : com.zixieqing.handler</p>
 * <p>@author       : ZiXieqing</p>
 */

public class TwoHakimHandler extends AbstractHakimHandler {

    private Logger logger = LoggerFactory.getLogger(OneHakimHandler.class);

    @Override
    public String hakim(String name) {
        logger.info("进入TwoHakimHandler处理器");

        if (UsernameEnum.ZIMINGXUAN.toString().equals(name.trim().toUpperCase())) {
            logger.info("正在进行数据查询..........");
            logger.info("查询到用户：{}", name);
            return "欢迎：" + name + " 进入系统";
        }

        if (null != getNext())
            return getNext().hakim(name);

        return "没有处理者能够处理该请求";
    }
}
