package com.runoops.patterns.bridge;

/**
 * 具体实现：短信发送
 */
public class SmsSender implements MessageSender {
    @Override
    public void send(String content) {
        System.out.println("【短信】发送消息：" + content);
    }
}
