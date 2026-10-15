package com.runoops.patterns.flyweight;

/**
 * ConcreteFlyweight: shared piece with internal state (color)
 */
public class ConcreteChessPiece extends ChessPiece {
    public ConcreteChessPiece(String color) {
        this.color = color;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Piece color:" + color + ", position:(" + x + "," + y + ")");
    }
}
