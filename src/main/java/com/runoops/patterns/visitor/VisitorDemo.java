package com.runoops.patterns.visitor;

/**
 * Visitor pattern demo (client)
 * Article: https://runoops.com/design-patterns-visitor.html
 *
 * Same computer structure; different visitors for name / price.
 */
public class VisitorDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();

        NameVisitor nameVisitor = new NameVisitor();
        computer.accept(nameVisitor);

        PriceVisitor priceVisitor = new PriceVisitor();
        computer.accept(priceVisitor);
        System.out.println("Total price: " + priceVisitor.getTotalPrice());
    }
}
