package com.runoops.patterns.flyweight;

/**
 * Flyweight: abstract chess piece
 * Ref: https://runoops.com/design-patterns-flyweight.html
 */
public abstract class ChessPiece {
    protected String color;

    public abstract void display(int x, int y);
}
