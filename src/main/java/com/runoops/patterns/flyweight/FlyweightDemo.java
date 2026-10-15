package com.runoops.patterns.flyweight;

/**
 * Flyweight pattern demo (client)
 * Article: https://runoops.com/design-patterns-flyweight.html
 *
 * color is internal (shared); x,y are external (passed by client).
 */
public class FlyweightDemo {

    public static void main(String[] args) {
        ChessPieceFactory factory = new ChessPieceFactory();

        ChessPiece black1 = factory.getChessPiece("black");
        black1.display(1, 2);

        ChessPiece black2 = factory.getChessPiece("black");
        black2.display(3, 4);

        ChessPiece white1 = factory.getChessPiece("white");
        white1.display(5, 6);

        System.out.println("Total shared objects in pool: " + factory.getPoolSize());
        System.out.println("black1 == black2 ? " + (black1 == black2));
    }
}
