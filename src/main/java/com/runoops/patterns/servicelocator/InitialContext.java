package com.runoops.patterns.servicelocator;

/**
 * Initial Context: lookup raw service instances
 */
public class InitialContext {
    public Service lookup(String serviceName) {
        if ("EmailService".equalsIgnoreCase(serviceName)) {
            return new EmailService();
        } else if ("SmsService".equalsIgnoreCase(serviceName)) {
            return new SmsService();
        }
        return null;
    }
}
