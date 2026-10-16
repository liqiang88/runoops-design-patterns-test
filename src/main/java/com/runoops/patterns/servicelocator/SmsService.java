package com.runoops.patterns.servicelocator;

/**
 * Concrete Service: SMS
 */
public class SmsService implements Service {
    @Override
    public String getName() {
        return "SmsService";
    }

    @Override
    public void execute() {
        System.out.println("SmsService: Send sms message");
    }
}
