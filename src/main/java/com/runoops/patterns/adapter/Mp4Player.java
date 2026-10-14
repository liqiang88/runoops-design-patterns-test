package com.runoops.patterns.adapter;

/**
 * 被适配者：已存在的老 MP4 播放器，接口不匹配
 */
public class Mp4Player {
    public void playMp4(String fileName) {
        System.out.println("播放MP4文件：" + fileName);
    }
}
