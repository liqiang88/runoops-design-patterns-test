package com.runoops.patterns.strategy;

/**
 * ConcreteStrategy: normal 10% off
 */
public class NormalDiscount implements DiscountStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.9;
    }
}
