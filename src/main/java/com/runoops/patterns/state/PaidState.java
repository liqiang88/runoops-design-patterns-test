package com.runoops.patterns.state;

/**
 * ConcreteState: paid
 */
public class PaidState extends OrderState {
    @Override
    public void pay() {
        System.out.println("Order already paid");
    }

    @Override
    public void ship() {
        System.out.println("Order shipped successfully");
        context.setState(new ShippedState());
    }
}
