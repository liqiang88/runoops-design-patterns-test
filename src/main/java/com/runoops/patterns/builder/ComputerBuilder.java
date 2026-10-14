package com.runoops.patterns.builder;

/**
 * 抽象建造者：定义构建各零件的步骤
 */
public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    public abstract void buildCpu();

    public abstract void buildMemory();

    public abstract void buildDisk();

    public abstract void buildScreen();

    public Computer getComputer() {
        return computer;
    }
}
