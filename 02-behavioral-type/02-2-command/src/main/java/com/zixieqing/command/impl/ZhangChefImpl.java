package com.zixieqing.command.impl;

import com.zixieqing.Food;
import com.zixieqing.MenuEnum;
import com.zixieqing.command.IChef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@description  : 该类功能  张师：假如他是专门做火锅系列的
 * </p>
 * <p>@package      : com.zixieqing.command.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ZhangChefImpl implements IChef {

    private Logger logger = LoggerFactory.getLogger(ZhangChefImpl.class);

    @Override
    public Food cook(List<String> foodList) {
        for (String name : foodList) {
            if (MenuEnum.YUAN_YANG_GUO.getFoodName().equals(name)) {
                logger.info("张师正在准备做：{}", name);

                List<String> excipients = new ArrayList<>();
                excipients.add("食盐半勺");
                excipients.add("味精少量");
                excipients.add("八角微量");
                excipients.add("糖少许");
                excipients.add("酱油半勺");
                excipients.add("耗油微量");
                excipients.add("葱姜蒜适量");

                Food food = new Food();
                food.setName(name)
                        .setOil("菜油")
                        .setChili("朝天椒")
                        .setExcipients(excipients)
                        .setContainer("鸳鸯锅");

                logger.info("张师做好了：{}，成品为：{}", name, food);

                return food;
            }
        }

        return null;
    }
}
