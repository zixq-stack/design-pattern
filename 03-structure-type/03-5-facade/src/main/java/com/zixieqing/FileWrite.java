package com.zixieqing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * <p>@description  : 该类功能  充当子系统功能之一：写文件
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class FileWrite {
    private Logger logger = LoggerFactory.getLogger(FileWrite.class);

    /**
     * <p>@description  : 该方法功能 写文件
     * </p>
     * <p>@methodName   : writeFile</p>
     * <p>@author: ZiXieqing</p>
     * @param filePath 要写入的路径
     * @param text  要写入的内容
     * @return boolean 是否写入成功
     */
    public boolean writeFile(String filePath, String text) {
        FileOutputStream fos = null;
        try {
            logger.info("正在进行文件写入！");
            fos = new FileOutputStream(filePath);
            fos.write(text.getBytes(StandardCharsets.UTF_8));
            logger.info("文件写入完毕！");
            return true;
        } catch (IOException e) {
            logger.info("文件写入失败!");
            e.printStackTrace();
            return false;
        } finally {
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
