package com.runoops.patterns.interpreter;

/**
 * Interpreter pattern demo (client)
 * Article: https://runoops.com/design-patterns-interpreter.html
 *
 * Build expression tree for: 10 + 5 - 3
 */
public class InterpreterDemo {

    public static void main(String[] args) {
        // Build expression: 10 + 5 - 3
        Expression num10 = new NumberExpression(10);
        Expression num5 = new NumberExpression(5);
        Expression num3 = new NumberExpression(3);

        Expression add = new AddExpression(num10, num5);
        Expression sub = new SubExpression(add, num3);

        int result = sub.interpret();
        System.out.println("Result = " + result);
    }
}
