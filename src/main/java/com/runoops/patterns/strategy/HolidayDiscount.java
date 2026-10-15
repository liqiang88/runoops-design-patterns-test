package com.runoops.patterns.strategy;

/**
 * ConcreteStrategy: holiday 30% off
 */
public class HolidayDiscount implements DiscountStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.7;
    }
}
