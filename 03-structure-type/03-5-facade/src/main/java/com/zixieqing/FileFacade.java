package com.zixieqing;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <p>@description  : 该类功能  门面角色：单例的
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class FileFacade {
    private static final AtomicReference<FileFacade> INSTANCE = new AtomicReference<>();
    /**
     * 加载文件
     */
    private FileLoad fileLoad;
    /**
     * 写入文件
     */
    private FileWrite fileWrite;
    /**
     * 文件加密
     */
    private FileEncrypt fileEncrypt;

    private FileFacade() {
        fileLoad = new FileLoad();
        fileWrite = new FileWrite();
        fileEncrypt = new FileEncrypt();
    }

    /**
     * <p>@description  : 该方法功能 加载文件
     * </p>
     * <p>@methodName   : fileLoad</p>
     * <p>@author: ZiXieqing</p>
     * @param filePath  文件路径
     * @return java.lang.String 加载出来的文件
     */
    public String fileLoad(String filePath) {
        return fileLoad.loadFile(filePath);
    }

    /**
     * <p>@description  : 该方法功能 加密文件
     * </p>
     * <p>@methodName   : fileEncrypt</p>
     * <p>@author: ZiXieqing</p>
     * @param text  要加密的内容
     * @return java.lang.String 加密后的内容
     */
    public String fileEncrypt(String text) {
        return fileEncrypt.encryptFile(text);
    }

    /**
     * <p>@description  : 该方法功能 写文件
     * </p>
     * <p>@methodName   : fileWrite</p>
     * <p>@author: ZiXieqing</p>
     * @param filePath 要写入的路径
     * @param text  要写入的内容
     * @return boolean 是否写入成功
     */
    public boolean fileWrite(String filePath, String text) {
        return fileWrite.writeFile(filePath, text);
    }

    public static FileFacade getInstance() {
        while (true) {
            FileFacade FILEFACADE_INSTANCE = INSTANCE.get();

            if (null != FILEFACADE_INSTANCE) return FILEFACADE_INSTANCE;

            INSTANCE.compareAndSet(null, new FileFacade());

            return INSTANCE.get();
        }
    }
}
