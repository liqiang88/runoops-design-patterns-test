package com.runoops.patterns.bridge;

/**
 * 扩充抽象：紧急消息
 */
public class UrgentMessage extends Message {
    public UrgentMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    public void sendMessage(String content) {
        sender.send("【紧急】" + content);
    }
}
