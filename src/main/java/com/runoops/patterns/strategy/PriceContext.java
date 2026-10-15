package com.runoops.patterns.strategy;

/**
 * Context: hold and invoke discount strategy
 */
public class PriceContext {
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double getFinalPrice(double price) {
        return strategy.calculate(price);
    }
}
