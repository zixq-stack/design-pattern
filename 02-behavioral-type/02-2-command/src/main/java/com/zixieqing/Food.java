package com.zixieqing;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * <p>@description  : 该类功能  菜
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

@Data
@ToString
@Accessors(chain = true)
public class Food {

    /**
     * 菜名
     */
    private String name;

    /**
     * 油：菜油、猪油、地沟油(^_^)......
     */
    private String oil;

    /**
     * 辣椒类型：有线辣椒、小米椒、青椒、朝天椒..........
     */
    private String chili;

    /**
     * 配料：食盐、味精、八角、糖、酱油、耗油、醋、料酒、姜、葱、蒜.........
     */
    private List<String> excipients;

    /**
     * 容器：碗、锅、盘子
     */
    private String container;
}
