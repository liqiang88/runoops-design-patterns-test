package com.runoops.patterns.businessdelegate;

/**
 * Business Delegate: facade for presentation layer
 */
public class BusinessDelegate {
    private final LookupService lookupService = new LookupService();
    private BusinessService businessService;

    public void setServiceType(String serviceType) {
        businessService = lookupService.getBusinessService(serviceType);
    }

    public void doTask() {
        businessService.doTask();
    }
}
