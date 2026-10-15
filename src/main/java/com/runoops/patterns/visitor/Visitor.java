package com.runoops.patterns.visitor;

/**
 * Visitor: visit each computer part
 * Ref: https://runoops.com/design-patterns-visitor.html
 */
public interface Visitor {
    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Mouse mouse);
}
