package com.zixieqing.o2factorymethod.factory.impl;

import com.zixieqing.o2factorymethod.IFileParser;
import com.zixieqing.o2factorymethod.factory.IParserFactory;
import com.zixieqing.o2factorymethod.impl.JsonFileParse;

/**
 * <p>@description  : 该类功能  json解析工厂
 * </p>
 * <p>@package      : com.zixieqing.o2factorymethod.factory</p>
 * <p>@author       : ZiXieqing</p>
 */

public class JsonParseFactory implements IParserFactory {

    @Override
    public IFileParser parse() {
        return new JsonFileParse();
    }
}
