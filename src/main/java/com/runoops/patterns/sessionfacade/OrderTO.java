package com.runoops.patterns.sessionfacade;

/**
 * Transfer Object: order data
 */
public class OrderTO {
    private Long orderId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
