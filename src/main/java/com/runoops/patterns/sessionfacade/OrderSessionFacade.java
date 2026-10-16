package com.runoops.patterns.sessionfacade;

/**
 * Session Facade: orchestrate fine-grained BOs
 */
public class OrderSessionFacade {
    private final OrderBO orderBO = new OrderBO();
    private final InventoryBO inventoryBO = new InventoryBO();

    public OrderTO placeOrder() {
        // orchestrate multiple fine-grained businesses
        orderBO.createOrder();
        inventoryBO.reduceStock();
        OrderTO orderTO = new OrderTO();
        orderTO.setOrderId(100001L);
        return orderTO;
    }
}
