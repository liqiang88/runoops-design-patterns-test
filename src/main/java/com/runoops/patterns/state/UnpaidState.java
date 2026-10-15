package com.runoops.patterns.state;

/**
 * ConcreteState: unpaid
 */
public class UnpaidState extends OrderState {
    @Override
    public void pay() {
        System.out.println("Order paid successfully");
        context.setState(new PaidState());
    }

    @Override
    public void ship() {
        System.out.println("Cannot ship, order is unpaid");
    }
}
