package com.zixieqing.o1simplefactory.o2complex.qvod;

import com.zixieqing.o1simplefactory.o2complex.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  快播兑换卡业务
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o2complex.qvod</p>
 * <p>@author       : ZiXieqing</p>
 */

public class QvodService {

    private Logger logger = LoggerFactory.getLogger(QvodService.class);

    /**
     * <p>@description  : 该方法功能 授予兑换卡
     * </p>
     * <p>@methodName   : grentToken</p>
     * <p>@author: ZiXieqing</p>
     * @param phone 用户手机号
     * @param cardId  随机生成的卡号
     * @return com.zixieqing.o1simplefactory.o2complex.util.ResultUtil
     */
    public ResultUtil grentToken(String phone, String cardId) {
        logger.info("授予的兑换卡为：{}", phone + cardId);
        return new ResultUtil("0000", phone + cardId);
    }
}
