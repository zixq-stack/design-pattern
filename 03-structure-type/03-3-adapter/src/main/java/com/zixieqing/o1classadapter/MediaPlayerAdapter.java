package com.zixieqing.o1classadapter;

import com.zixieqing.o1classadapter.impl.Mp4Player;
import com.zixieqing.o1classadapter.impl.VlcPlayer;

/**
 * <p>@description  : 该类功能  适配器：
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class MediaPlayerAdapter implements MediaPlayer{

    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaPlayerAdapter(String audioType) {
        if (TypeEnum.VLC.toString().equalsIgnoreCase(audioType))
            advanceMediaPlayer = new VlcPlayer();

        if (TypeEnum.MP4.toString().equalsIgnoreCase(audioType))
            advanceMediaPlayer = new Mp4Player();
    }

    /**
     * 媒体播放
     *
     * @param audioType 音频类型
     * @param fileName 文件名
     */
    @Override
    public void play(String audioType, String fileName) {
        if (TypeEnum.VLC.toString().equalsIgnoreCase(audioType))
            advanceMediaPlayer.playVlc(fileName);

        if (TypeEnum.MP4.toString().equalsIgnoreCase(audioType))
            advanceMediaPlayer.playMp4(fileName);

    }
}
