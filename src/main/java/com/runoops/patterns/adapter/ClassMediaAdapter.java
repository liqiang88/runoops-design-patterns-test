package com.runoops.patterns.adapter;

/**
 * 类适配器（Java 受限，仅作演示）：继承被适配者并实现目标接口
 */
public class ClassMediaAdapter extends Mp4Player implements MediaPlayer {
    @Override
    public void play(String fileName) {
        playMp4(fileName);
    }
}
