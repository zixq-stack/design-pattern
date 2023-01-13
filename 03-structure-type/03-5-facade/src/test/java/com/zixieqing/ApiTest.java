package com.zixieqing;

import org.junit.Test;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {

    @Test
    public void facadeTest() {
        FileFacade fileFacade = FileFacade.getInstance();
        boolean result = fileFacade.fileWrite("src/main/resources/encryptText.txt",
                fileFacade.fileEncrypt(fileFacade.fileLoad("src/main/resources/originalText.txt")));

        System.out.println("result = " + result);
    }
}
