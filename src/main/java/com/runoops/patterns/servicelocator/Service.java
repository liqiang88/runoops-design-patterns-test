package com.runoops.patterns.servicelocator;

/**
 * Service Interface
 * Ref: https://runoops.com/design-patterns-service-locator.html
 */
public interface Service {
    String getName();

    void execute();
}
