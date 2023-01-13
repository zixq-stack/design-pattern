package com.zixieqing.o1simple.impl;

import com.zixieqing.o1simple.Article;
import com.zixieqing.o1simple.IBlogger;
import com.zixieqing.o1simple.IFan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@description  : 该类功能  一个叫紫邪情的厚脸皮博主
 * </p>
 * <p>@package      : com.zixieqing.o1simple.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Zixieqing implements IBlogger {

    private Logger logger = LoggerFactory.getLogger(Zixieqing.class);

    /**
     * 粉丝列表：一对多
     */
    private List<IFan> fanList = new ArrayList<>();

    @Override
    public boolean add(IFan fan) {
        if (!fanList.contains(fan))
            return fanList.add(fan);

        return false;
    }

    @Override
    public boolean remove(IFan fan) {
        if (!add(fan))
            return fanList.remove(fan);

        return false;
    }

    @Override
    public void notice(Article article) {
        for (IFan fan : fanList) {
            fan.response(article);
        }
    }
}
