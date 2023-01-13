package com.zixieqing.o1classadapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  高级媒体播放器
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface AdvanceMediaPlayer {

    Logger LOGGER = LoggerFactory.getLogger(AdvanceMediaPlayer.class);

    /**
     * 播放vlc格式
     * @param fileName 文件名
     */
    void playVlc(String fileName);

    /**
     * 播放mp4格式
     * @param fileName 文件名
     */
    void playMp4(String fileName);
}
