package com.runoops.patterns.visitor;

/**
 * Element: accept a visitor
 */
public interface ComputerPart {
    void accept(Visitor visitor);
}
