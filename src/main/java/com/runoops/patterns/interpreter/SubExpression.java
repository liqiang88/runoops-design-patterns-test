package com.runoops.patterns.interpreter;

/**
 * NonTerminalExpression: subtraction
 */
public class SubExpression extends Expression {
    private final Expression left;
    private final Expression right;

    public SubExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
