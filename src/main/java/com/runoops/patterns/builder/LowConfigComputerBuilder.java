package com.runoops.patterns.builder;

/**
 * 具体建造者：低配电脑
 */
public class LowConfigComputerBuilder extends ComputerBuilder {
    @Override
    public void buildCpu() {
        computer.setCpu("i3 处理器");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("8G 内存");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("512G SSD");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("1080P 显示器");
    }
}
