package com.runoops.patterns.visitor;

/**
 * ConcreteVisitor: print part names
 */
public class NameVisitor implements Visitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Computer part: Keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Computer part: Monitor");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Computer part: Mouse");
    }
}
