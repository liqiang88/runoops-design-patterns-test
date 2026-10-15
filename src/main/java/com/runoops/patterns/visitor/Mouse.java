package com.runoops.patterns.visitor;

/**
 * ConcreteElement: mouse
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
