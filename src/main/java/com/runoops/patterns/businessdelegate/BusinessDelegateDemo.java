package com.runoops.patterns.businessdelegate;

/**
 * Business Delegate pattern demo (client)
 * Article: https://runoops.com/design-patterns-business-delegate.html
 *
 * Presentation layer calls BusinessDelegate only; lookup is hidden.
 */
public class BusinessDelegateDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();

        businessDelegate.setServiceType("ORDER");
        businessDelegate.doTask();

        businessDelegate.setServiceType("PAYMENT");
        businessDelegate.doTask();
    }
}
