package com.zixieqing;

/**
 * <p>@description  : 该类功能  菜单枚举类：就是去点菜时需要看有哪些菜的菜单
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public enum MenuEnum {

    /**
     * 鱼香肉丝
     */
    YU_XIANG_ROU_SI("鱼香肉丝", "18"),

    /**
     * 鸳鸯锅
     */
    YUAN_YANG_GUO("鸳鸯锅", "50"),

    ;

    private String foodName;

    private String price;

    MenuEnum(String foodName, String price) {
        this.foodName = foodName;
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
