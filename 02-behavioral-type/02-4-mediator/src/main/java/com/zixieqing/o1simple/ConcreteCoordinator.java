package com.zixieqing.o1simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  具体协调者
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ConcreteCoordinator extends Coordinator {

    private Logger logger = LoggerFactory.getLogger(ConcreteCoordinator.class);

    /**
     * 代表吵架
     */
    private static final int QUARREL = 1;

    /**
     * 代表退还物品
     */
    private static final int HANDOVER = 2;

    /**
     * MAG_FLAG 消息标识 1、给女传话；2、给男传话
     * HANDOVER_FLAG 退还物品标识 1、给女退还物品；2、给男退还物品
     */
    public static int MSG_FLAG = 1, HANDOVER_FLAG = 1;

    /**
     * 中介者 / 协调者的核心方法，也是对外暴露的方法：处理同事角色关系
     *
     * @param type  事件类型 1、传话；2、退还物品
     * @param thing 发生对应类型时要做的事
     */
    @Override
    public void handler(int type, String thing) {
        switch (type) {
            case QUARREL:
                this.message(thing);
                break;
            case HANDOVER:
                this.handover(thing);
                break;
            default:
                logger.info("贫道爱莫能助，只能摆烂..........");
        }
    }

    /**
     * 传话
     *
     * @param context 传话内容
     */
    private void message(String context) {
        if (1 == MSG_FLAG)
            super.woman.talkToFriend(context);

        if (2 == MSG_FLAG)
            super.man.love(context);
    }

    /**
     * 退还物品
     *
     * @param thing 要退还的东西
     */
    private void handover(String thing) {
        if (1 == HANDOVER_FLAG)
            super.woman.talkToFriend(thing);

        if (2 == HANDOVER_FLAG)
            super.man.love(thing);
    }
}
