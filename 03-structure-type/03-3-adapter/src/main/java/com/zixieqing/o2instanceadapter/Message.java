package com.zixieqing.o2instanceadapter;

import java.util.Date;

/**
 * <p>@description  : 该类功能  目标角色：统一消息体
 * </p>
 * <p>@package      : com.zixieqing.o2instanceadapter</p>
 * <p>@author       : ZiXieqing</p>
 * <p>@createTime   : 2022-12-12</p>
 * <p>@version      : V1.0.0</p>
 */

public class Message {

    /**
     * 用户ID
     */
    private String userId;
    /**
     * 业务ID
     */
    private String bizId;
    /**
     * 业务时间
     */
    private Date bizTime;
    /**
     * 业务描述
     */
    private String desc;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Date getBizTime() {
        return bizTime;
    }

    public void setBizTime(Date bizTime) {
        this.bizTime = bizTime;
    }

    public void setBizTime(String bizTime) {
        this.bizTime = new Date(Long.parseLong(bizTime));
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
