package com.zixieqing.o2instanceadapter;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <p>@description  : 该类功能  消息适配器
 * </p>
 * <p>@package      : com.zixieqing.o2instanceadapter</p>
 * <p>@author       : ZiXieqing</p>
 * <p>@createTime   : 2022-12-12</p>
 * <p>@version      : V1.0.0</p>
 */

public class MessageAdapter {

    /**
     * 消息适配
     * @param jsonStr 要适配的对象字符串 如：InternalOrder
     * @param filedMap 字段映射关系   如：userId ——> uId
     * @return 转换成的统一消息体
     */
    public static Message msgAdapter(String jsonStr, Map<String, String> filedMap) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {

        Map instance = JSON.parseObject(jsonStr, Map.class);

        Message message = new Message();

        for (String key : filedMap.keySet()) {
            Object val = instance.get(filedMap.get(key));
            // 给消息通用体Message赋值
            Message.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class)
                    .invoke(message, val.toString());
        }
        return message;
    }
}
