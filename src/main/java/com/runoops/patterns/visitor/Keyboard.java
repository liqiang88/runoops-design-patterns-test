package com.runoops.patterns.visitor;

/**
 * ConcreteElement: keyboard
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
