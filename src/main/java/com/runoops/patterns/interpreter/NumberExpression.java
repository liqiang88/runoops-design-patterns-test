package com.runoops.patterns.interpreter;

/**
 * TerminalExpression: number leaf
 */
public class NumberExpression extends Expression {
    private final int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
