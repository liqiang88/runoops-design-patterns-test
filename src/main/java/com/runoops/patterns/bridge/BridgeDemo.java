package com.runoops.patterns.bridge;

/**
 * 桥接模式演示（客户端）
 * 文章：https://runoops.com/design-patterns-bridge.html
 *
 * 消息类型（抽象层）与发送渠道（实现层）通过组合桥接，可独立扩展。
 */
public class BridgeDemo {

    public static void main(String[] args) {
        // 普通消息，短信渠道
        Message normalSms = new NormalMessage(new SmsSender());
        normalSms.sendMessage("订单已发货");

        // 紧急消息，邮件渠道
        Message urgentEmail = new UrgentMessage(new EmailSender());
        urgentEmail.sendMessage("账户异常，请尽快处理");
    }
}
