package com.runoops.patterns.state;

/**
 * Context: order that delegates actions to current state
 */
public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new UnpaidState();
        state.setContext(this);
    }

    public void setState(OrderState state) {
        this.state = state;
        state.setContext(this);
    }

    public void pay() {
        state.pay();
    }

    public void ship() {
        state.ship();
    }
}
