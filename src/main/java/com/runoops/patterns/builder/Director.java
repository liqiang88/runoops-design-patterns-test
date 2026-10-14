package com.runoops.patterns.builder;

/**
 * 指挥者：按固定顺序调用建造步骤，不关心零件细节
 */
public class Director {
    public Computer construct(ComputerBuilder builder) {
        builder.buildCpu();
        builder.buildMemory();
        builder.buildDisk();
        builder.buildScreen();
        return builder.getComputer();
    }
}
