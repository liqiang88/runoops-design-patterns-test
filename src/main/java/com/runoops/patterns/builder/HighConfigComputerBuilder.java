package com.runoops.patterns.builder;

/**
 * 具体建造者：高配电脑
 */
public class HighConfigComputerBuilder extends ComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCpu("i9 处理器");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("64G 内存");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("2TB SSD");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("4K 显示器");
    }
}
