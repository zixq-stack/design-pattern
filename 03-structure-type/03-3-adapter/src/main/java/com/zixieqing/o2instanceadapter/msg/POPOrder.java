package com.zixieqing.o2instanceadapter.msg;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>@description  : 该类功能  源角色：系统已有对象  第三方订单消息体
 * </p>
 * <p>@package      : com.zixieqing.o2instanceadapter</p>
 * <p>@author       : ZiXieqing</p>
 * <p>@createTime   : 2022-12-12</p>
 * <p>@version      : V1.0.0</p>
 */

public class POPOrder {

    /**
     * 用户ID
     */
    private String uId;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 下单时间
     */
    private Date orderTime;
    /**
     * 商品
     */
    private Date sku;
    /**
     * 商品名称
     */
    private Date skuName;
    /**
     * 金额
     */
    private BigDecimal decimal;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getSku() {
        return sku;
    }

    public void setSku(Date sku) {
        this.sku = sku;
    }

    public Date getSkuName() {
        return skuName;
    }

    public void setSkuName(Date skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        return "POPOrder{" +
                "uId='" + uId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderTime=" + orderTime +
                ", sku=" + sku +
                ", skuName=" + skuName +
                ", decimal=" + decimal +
                '}';
    }
}
