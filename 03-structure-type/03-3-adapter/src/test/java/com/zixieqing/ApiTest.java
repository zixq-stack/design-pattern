package com.zixieqing;

import com.alibaba.fastjson.JSON;
import com.zixieqing.o2instanceadapter.msg.InternalOrder;
import com.zixieqing.o2instanceadapter.Message;
import com.zixieqing.o2instanceadapter.MessageAdapter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void instanceAdapterTest() throws ParseException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {

        Date data = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-12-13 10:39:40");

        InternalOrder internalOrder = new InternalOrder();
        internalOrder.setOrderId(System.nanoTime() + "");
        internalOrder.setUid(System.currentTimeMillis() + "");
        internalOrder.setCreateOrderTime(data);
        internalOrder.setSku("10888787897898798");

        HashMap<String, String> filedMap = new HashMap<>();
        filedMap.put("userId", "uid");
        filedMap.put("bizId", "orderId");
        filedMap.put("bizTime", "createOrderTime");

        // 进行转换
        Message msgAdapter = MessageAdapter.msgAdapter(JSON.toJSONString(internalOrder), filedMap);

        logger.info("适配前：{}",JSON.toJSONString(internalOrder));
        logger.info("适配后：{}", JSON.toJSONString(msgAdapter));

    }
}
