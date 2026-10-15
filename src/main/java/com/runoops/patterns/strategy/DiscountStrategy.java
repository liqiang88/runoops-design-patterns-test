package com.runoops.patterns.strategy;

/**
 * Strategy: discount algorithm
 * Ref: https://runoops.com/design-patterns-strategy.html
 */
public interface DiscountStrategy {
    double calculate(double price);
}
