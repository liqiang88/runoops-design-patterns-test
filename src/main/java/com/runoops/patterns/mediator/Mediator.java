package com.runoops.patterns.mediator;

/**
 * Mediator: chat room communication interface
 * Ref: https://runoops.com/design-patterns-mediator.html
 */
public interface Mediator {
    void register(User user);

    void relay(String from, String message);
}
