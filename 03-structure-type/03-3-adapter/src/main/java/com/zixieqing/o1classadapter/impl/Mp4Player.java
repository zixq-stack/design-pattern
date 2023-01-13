package com.zixieqing.o1classadapter.impl;

import com.zixieqing.o1classadapter.AdvanceMediaPlayer;

/**
 * <p>@description  : 该类功能  mp4格式播放器
 * </p>
 * <p>@package      : com.zixieqing.o1class$adapter.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class Mp4Player implements AdvanceMediaPlayer {
    /**
     * 播放vlc格式
     *
     * @param fileName 文件名
     */
    @Override
    public void playVlc(String fileName) {
        // 不做事
    }

    /**
     * 播放mp4格式
     *
     * @param fileName 文件名
     */
    @Override
    public void playMp4(String fileName) {
        LOGGER.info("mp4格式播放器该做的逻辑处理");
    }
}
