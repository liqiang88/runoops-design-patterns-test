package com.runoops.patterns.bridge;

/**
 * 具体实现：邮件发送
 */
public class EmailSender implements MessageSender {
    @Override
    public void send(String content) {
        System.out.println("【邮件】发送消息：" + content);
    }
}
