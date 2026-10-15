package com.runoops.patterns.bridge;

/**
 * 扩充抽象：普通消息
 */
public class NormalMessage extends Message {
    public NormalMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    public void sendMessage(String content) {
        sender.send("普通消息：" + content);
    }
}
