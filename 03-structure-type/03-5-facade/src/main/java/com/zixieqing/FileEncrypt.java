package com.zixieqing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  充当子系统功能之一：文件加密
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class FileEncrypt {
    private Logger logger = LoggerFactory.getLogger(FileEncrypt.class);

    /**
     * <p>@description  : 该方法功能 加密文件
     * </p>
     * <p>@methodName   : encryptFile</p>
     * <p>@author: ZiXieqing</p>
     * @param text  要加密的内容
     * @return java.lang.String 加密后的内容
     */
    public String encryptFile(String text) {
        logger.info("即将对文件内容进行加密！");
        // 简单地对文本内容进行反转
        String result = new StringBuffer(text).reverse().toString();

        logger.info("文件内容加密成功");

        return result;
    }
}
