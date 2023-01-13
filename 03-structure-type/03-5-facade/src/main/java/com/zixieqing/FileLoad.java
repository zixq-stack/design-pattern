package com.zixieqing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * <p>@description  : 该类功能  充当子系统功能之一：文件加载
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class FileLoad {
    private Logger logger = LoggerFactory.getLogger(FileLoad.class);

    /**
     * 加载文件
     * @param filePath 文件路径
     * @return 加载出来的内容
     */
    public String loadFile(String filePath) {
        logger.info("即将读取文件内容！");

        BufferedReader br = null;
        StringBuffer result = new StringBuffer();
        try {
            br = new BufferedReader(new FileReader(filePath));
            String data = "";
            while (null != (data = br.readLine())) {
                result.append("\n").append(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != br) {
                try {
                    br.close();
                    logger.info("文件读取完毕！");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return result.toString();
    }
}
