package com.runoops.patterns.observer;

/**
 * Observer: receive temperature updates
 * Ref: https://runoops.com/design-patterns-observer.html
 */
public interface Observer {
    void update(float temperature);
}
