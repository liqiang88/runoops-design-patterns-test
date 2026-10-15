package com.runoops.patterns.state;

/**
 * ConcreteState: shipped
 */
public class ShippedState extends OrderState {
    @Override
    public void pay() {
        System.out.println("Cannot pay, order already shipped");
    }

    @Override
    public void ship() {
        System.out.println("Order already shipped");
    }
}
