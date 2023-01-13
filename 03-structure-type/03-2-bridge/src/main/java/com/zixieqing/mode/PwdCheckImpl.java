package com.zixieqing.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  具体实现化角色：密码校验
 * </p>
 * <p>@package      : com.zixieqing.mode</p>
 * <p>@author       : ZiXieqing</p>
 */

public class PwdCheckImpl implements IPayMode{

    private Logger logger = LoggerFactory.getLogger(PwdCheckImpl.class);

    @Override
    public boolean check(String uId) {
        logger.info("{} 正在进行风控校验，校验用户为：{}", this.getClass().getSimpleName(), uId);

        return true;
    }
}
