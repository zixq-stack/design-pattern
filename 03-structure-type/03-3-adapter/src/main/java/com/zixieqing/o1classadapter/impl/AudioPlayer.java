package com.zixieqing.o1classadapter.impl;

import com.zixieqing.o1classadapter.MediaPlayer;
import com.zixieqing.o1classadapter.MediaPlayerAdapter;
import com.zixieqing.o1classadapter.TypeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  音频播放器
 * </p>
 * <p>@package      : com.zixieqing.o1class$adapter.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class AudioPlayer implements MediaPlayer {

    private Logger logger = LoggerFactory.getLogger(AudioPlayer.class);

    private MediaPlayerAdapter mediaPlayerAdapter;

    /**
     * 媒体播放
     * @param audioType 音频类型
     * @param fileName 文件名
     */
    @Override
    public void play(String audioType, String fileName) {
        // 支持原有的格式 mp3
        if ("mp3".equalsIgnoreCase(audioType)) {
            logger.info("原有格式mp3播放的一系列逻辑");

        // 让其支持其他格式的音频播放
        } else if (TypeEnum.VLC.toString().equalsIgnoreCase(audioType)
                || TypeEnum.MP4.toString().equalsIgnoreCase(audioType)) {
            // 找适配器转
            mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
            mediaPlayerAdapter.play(audioType, fileName);
        } else {
            throw new IllegalStateException("音频格式不对，请切换符合的格式");
        }
    }
}
