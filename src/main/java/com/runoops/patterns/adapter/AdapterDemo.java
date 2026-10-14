package com.runoops.patterns.adapter;

/**
 * 适配器模式演示（客户端）
 * 文章：https://runoops.com/design-patterns-adapter.html
 *
 * 客户端只依赖 MediaPlayer，通过适配器兼容老的 Mp4Player。
 */
public class AdapterDemo {

    public static void main(String[] args) {
        System.out.println("========== 1. 对象适配器（推荐） ==========");
        Mp4Player mp4Player = new Mp4Player();
        MediaPlayer mediaPlayer = new MediaAdapter(mp4Player);
        mediaPlayer.play("demo.mp4");

        System.out.println("\n========== 2. 类适配器（演示） ==========");
        MediaPlayer classAdapter = new ClassMediaAdapter();
        classAdapter.play("demo.mp4");
    }
}
