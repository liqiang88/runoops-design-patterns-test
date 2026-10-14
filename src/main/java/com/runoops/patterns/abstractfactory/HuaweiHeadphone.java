package com.runoops.patterns.abstractfactory;

/**
 * 具体产品：华为耳机
 */
public class HuaweiHeadphone implements Headphone {
    @Override
    public void listen() {
        System.out.println("华为耳机播放音频");
    }
}
