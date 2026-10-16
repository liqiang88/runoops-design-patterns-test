package com.runoops.patterns.businessdelegate;

/**
 * Lookup Service: locate business service by type
 */
public class LookupService {
    public BusinessService getBusinessService(String serviceType) {
        if ("ORDER".equalsIgnoreCase(serviceType)) {
            return new OrderService();
        } else if ("PAYMENT".equalsIgnoreCase(serviceType)) {
            return new PaymentService();
        }
        return null;
    }
}
