package com.runoops.patterns.adapter;

/**
 * 对象适配器（推荐）：组合包装 Mp4Player，实现目标接口
 */
public class MediaAdapter implements MediaPlayer {
    private final Mp4Player mp4Player;

    public MediaAdapter(Mp4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void play(String fileName) {
        // 接口转换，调用被适配者方法
        mp4Player.playMp4(fileName);
    }
}
