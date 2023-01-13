package com.zixieqing.o1classadapter;

/**
 * <p>@description  : 该类功能  媒体播放器
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public interface MediaPlayer {

    /**
     * 媒体播放
     * @param audioType 音频类型
     * @param fileName 文件名
     */
    void play(String audioType, String fileName);
}
