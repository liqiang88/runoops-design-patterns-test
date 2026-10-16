package com.runoops.patterns.servicelocator;

/**
 * Service Locator pattern demo (client)
 * Article: https://runoops.com/design-patterns-service-locator.html
 *
 * First get creates and caches; later gets reuse cache.
 */
public class ServiceLocatorDemo {

    public static void main(String[] args) {
        ServiceLocator locator = new ServiceLocator();

        Service service1 = locator.getService("EmailService");
        service1.execute();

        Service service2 = locator.getService("EmailService");
        service2.execute();

        Service service3 = locator.getService("SmsService");
        service3.execute();

        Service service4 = locator.getService("SmsService");
        service4.execute();
    }
}
