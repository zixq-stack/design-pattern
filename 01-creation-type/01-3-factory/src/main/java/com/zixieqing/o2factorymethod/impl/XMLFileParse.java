package com.zixieqing.o2factorymethod.impl;

import com.zixieqing.o2factorymethod.IFileParser;

/**
 * <p>@description  : 该类功能  xml文件解析器
 * </p>
 * <p>@package      : com.zixieqing.o2factorymethod</p>
 * <p>@author       : ZiXieqing</p>
 */

public class XMLFileParse implements IFileParser {
    @Override
    public String parse() {
        return "这里就搞xml文件的解析逻辑";
    }
}
