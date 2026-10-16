package com.runoops.patterns.servicelocator;

/**
 * Concrete Service: email
 */
public class EmailService implements Service {
    @Override
    public String getName() {
        return "EmailService";
    }

    @Override
    public void execute() {
        System.out.println("EmailService: Send email message");
    }
}
