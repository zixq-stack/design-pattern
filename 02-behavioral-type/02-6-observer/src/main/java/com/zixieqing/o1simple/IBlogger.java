package com.zixieqing.o1simple;

/**
 * <p>@description  : 该类功能  博主接口：抽象主题 包含增加、删除、通知观察者对象的方法
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface IBlogger {

    /**
     * 将粉丝添加到通知列表中，能够让粉丝接受到通知
     *
     * @param fan 粉丝
     * @return true / false
     */
    boolean add(IFan fan);

    /**
     * 将粉丝拉入黑名单，不让其接收到通知
     *
     * @param fan 粉丝
     * @return true / false
     */
    boolean remove(IFan fan);

    /**
     * 通知观察者
     *
     * @param article 消息体
     */
    void notice(Article article);
}
