package com.runoops.patterns.bridge;

/**
 * 抽象层：消息抽象类，持有发送渠道引用作为桥
 */
public abstract class Message {
    protected MessageSender sender;

    public Message(MessageSender sender) {
        this.sender = sender;
    }

    public abstract void sendMessage(String content);
}
