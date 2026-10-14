package com.runoops.patterns.adapter;

/**
 * 目标接口：客户端期望的播放接口
 * 参考：https://runoops.com/design-patterns-adapter.html
 */
public interface MediaPlayer {
    void play(String fileName);
}
