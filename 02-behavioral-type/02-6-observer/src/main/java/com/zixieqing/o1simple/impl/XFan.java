package com.zixieqing.o1simple.impl;

import com.zixieqing.o1simple.Article;
import com.zixieqing.o1simple.IFan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@description  : 该类功能  一个叫X的粉丝
 * </p>
 * <p>@package      : com.zixieqing.o1simple.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class XFan extends IFan {

    private Logger logger = LoggerFactory.getLogger(XFan.class);

    /**
     * 粉丝感兴趣的博文列表
     */
    private static List<String> interestList = new ArrayList<>();

    static {
        interestList.add("消息中间件");
        interestList.add("爱码有道");
        interestList.add("分布式事务");
        interestList.add("分布式事务");
    }

    @Override
    public boolean response(Article article) {
        for (String interest : interestList) {
            if (article.getTitle().equals(interest)) {
                logger.info("粉丝：{}，接收了通知：{}，并开始去做一系列和自身数据相关的事情",
                        this.getClass().getSimpleName(),
                        article);
                return true;
            }
        }
        return false;
    }
}
