package com.zixieqing.o1simplefactory.o2complex.util;

/**
 * <p>@description  : 该类功能  返回结果集工具类
 * </p>
 * <p>@package      : com.zixieqing.o1simplefactory.o2complex.util</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ResultUtil {

    /**
     * 编码
     */
    private String code;

    /**
     * 信息
     */
    private String info;

    public ResultUtil(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
