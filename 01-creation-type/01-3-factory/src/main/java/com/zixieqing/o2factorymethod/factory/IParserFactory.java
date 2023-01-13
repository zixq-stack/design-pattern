package com.zixieqing.o2factorymethod.factory;

import com.zixieqing.o2factorymethod.IFileParser;

/**
 * <p>@description  : 该类功能  解析器抽象工厂
 * </p>
 * <p>@package      : com.zixieqing.o2factorymethod</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface IParserFactory {

    IFileParser parse();
}
