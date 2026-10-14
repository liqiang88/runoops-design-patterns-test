package com.runoops.patterns.abstractfactory;

/**
 * 具体产品：小米耳机
 */
public class MiHeadphone implements Headphone {
    @Override
    public void listen() {
        System.out.println("小米耳机播放音频");
    }
}
