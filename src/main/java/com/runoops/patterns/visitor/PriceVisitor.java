package com.runoops.patterns.visitor;

/**
 * ConcreteVisitor: sum part prices
 */
public class PriceVisitor implements Visitor {
    private double total = 0;

    @Override
    public void visit(Keyboard keyboard) {
        total += 80;
    }

    @Override
    public void visit(Monitor monitor) {
        total += 800;
    }

    @Override
    public void visit(Mouse mouse) {
        total += 50;
    }

    public double getTotalPrice() {
        return total;
    }
}
