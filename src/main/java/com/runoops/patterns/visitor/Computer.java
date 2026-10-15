package com.runoops.patterns.visitor;

import java.util.Arrays;
import java.util.List;

/**
 * ObjectStructure: computer composed of parts
 */
public class Computer implements ComputerPart {
    private final List<ComputerPart> parts;

    public Computer() {
        parts = Arrays.asList(new Keyboard(), new Monitor(), new Mouse());
    }

    @Override
    public void accept(Visitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
    }
}
