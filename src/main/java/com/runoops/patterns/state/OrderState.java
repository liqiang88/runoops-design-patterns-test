package com.runoops.patterns.state;

/**
 * State: abstract order state
 * Ref: https://runoops.com/design-patterns-state.html
 */
public abstract class OrderState {
    protected OrderContext context;

    public void setContext(OrderContext context) {
        this.context = context;
    }

    public abstract void pay();

    public abstract void ship();
}
