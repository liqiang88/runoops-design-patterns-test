package com.runoops.patterns.visitor;

/**
 * ConcreteElement: monitor
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
