package com.runoops.patterns.sessionfacade;

/**
 * Session Facade pattern demo (client)
 * Article: https://runoops.com/design-patterns-session-facede.html
 *
 * Client calls coarse-grained facade once; internal BOs stay hidden.
 */
public class SessionFacadeDemo {

    public static void main(String[] args) {
        OrderSessionFacade facade = new OrderSessionFacade();
        OrderTO orderTO = facade.placeOrder();
        System.out.println("Created OrderId: " + orderTO.getOrderId());
    }
}
