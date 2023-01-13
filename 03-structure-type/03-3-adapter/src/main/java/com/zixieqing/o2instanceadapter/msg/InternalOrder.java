package com.zixieqing.o2instanceadapter.msg;

import java.util.Date;

/**
 * <p>@description  : 该类功能  源角色：系统已有对象  内部订单消息体
 * </p>
 * <p>@package      : com.zixieqing.o2instanceadapter</p>
 * <p>@author       : ZiXieqing</p>
 * <p>@createTime   : 2022-12-12</p>
 * <p>@version      : V1.0.0</p>
 */

public class InternalOrder {

    /**
     * 用户ID
     */
    private String uid;
    /**
     * 商品
     */
    private String sku;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 下单时间
     */
    private Date createOrderTime;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCreateOrderTime() {
        return createOrderTime;
    }

    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
    }

    @Override
    public String toString() {
        return "InternalOrder{" +
                "uid='" + uid + '\'' +
                ", sku='" + sku + '\'' +
                ", orderId='" + orderId + '\'' +
                ", createOrderTime=" + createOrderTime +
                '}';
    }
}
