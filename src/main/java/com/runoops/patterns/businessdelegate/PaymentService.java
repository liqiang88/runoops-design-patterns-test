package com.runoops.patterns.businessdelegate;

/**
 * Concrete Business Service: payment
 */
public class PaymentService implements BusinessService {
    @Override
    public void doTask() {
        System.out.println("PaymentService: process payment business logic");
    }
}
