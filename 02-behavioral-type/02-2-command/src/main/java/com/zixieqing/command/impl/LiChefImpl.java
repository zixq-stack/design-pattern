package com.zixieqing.command.impl;

import com.zixieqing.Food;
import com.zixieqing.MenuEnum;
import com.zixieqing.command.IChef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@description  : 该类功能  李师：假如它是专门做炒菜系列的
 * </p>
 * <p>@package      : com.zixieqing.command.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class LiChefImpl implements IChef {

    private Logger logger = LoggerFactory.getLogger(LiChefImpl.class);

    @Override
    public Food cook(List<String> foodList) {
        for (String name : foodList) {
            if (MenuEnum.YU_XIANG_ROU_SI.getFoodName().equals(name)) {
                logger.info("李师正在准备做：{}", name);

                List<String> excipients = new ArrayList<>();
                excipients.add("食盐少量");
                excipients.add("味精少许");
                excipients.add("葱蒜少许");

                Food food = new Food();
                food.setName(name)
                        .setOil("猪油")
                        .setChili("青椒")
                        .setExcipients(excipients)
                        .setContainer("盘子");

                logger.info("李师做好了：{}，成品为：{}", name, food);

                return food;
            }
        }
        return null;
    }
}
