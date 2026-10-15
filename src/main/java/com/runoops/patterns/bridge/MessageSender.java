package com.runoops.patterns.bridge;

/**
 * 实现层接口：发送渠道
 * 参考：https://runoops.com/design-patterns-bridge.html
 */
public interface MessageSender {
    void send(String content);
}
