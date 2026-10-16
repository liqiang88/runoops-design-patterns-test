package com.runoops.patterns.businessdelegate;

/**
 * Concrete Business Service: order
 */
public class OrderService implements BusinessService {
    @Override
    public void doTask() {
        System.out.println("OrderService: process order business logic");
    }
}
