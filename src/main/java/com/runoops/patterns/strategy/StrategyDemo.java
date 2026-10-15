package com.runoops.patterns.strategy;

/**
 * Strategy pattern demo (client)
 * Article: https://runoops.com/design-patterns-strategy.html
 *
 * Switch discount strategy at runtime.
 */
public class StrategyDemo {

    public static void main(String[] args) {
        PriceContext context = new PriceContext();
        double originalPrice = 100;

        context.setStrategy(new NormalDiscount());
        System.out.println("Normal price: " + context.getFinalPrice(originalPrice));

        context.setStrategy(new HolidayDiscount());
        System.out.println("Holiday price: " + context.getFinalPrice(originalPrice));
    }
}
