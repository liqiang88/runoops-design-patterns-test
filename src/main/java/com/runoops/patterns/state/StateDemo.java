package com.runoops.patterns.state;

/**
 * State pattern demo (client)
 * Article: https://runoops.com/design-patterns-state.html
 *
 * Order behavior changes with Unpaid -> Paid -> Shipped.
 */
public class StateDemo {

    public static void main(String[] args) {
        OrderContext order = new OrderContext();
        order.pay();
        order.ship();
        order.pay();
        order.ship();
    }
}
