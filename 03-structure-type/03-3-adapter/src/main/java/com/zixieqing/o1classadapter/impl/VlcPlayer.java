package com.zixieqing.o1classadapter.impl;

import com.zixieqing.o1classadapter.AdvanceMediaPlayer;

/**
 * <p>@description  : 该类功能  播放vlc格式的播放器
 * </p>
 * <p>@package      : com.zixieqing.o1class$adapter.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class VlcPlayer implements AdvanceMediaPlayer {
    /**
     * 播放vlc格式
     *
     * @param fileName 文件名
     */
    @Override
    public void playVlc(String fileName) {
        LOGGER.info("进行vlc播放的一些逻辑处理");
    }

    /**
     * 播放mp4格式
     *
     * @param fileName 文件名
     */
    @Override
    public void playMp4(String fileName) {
        // 不做事
    }
}
