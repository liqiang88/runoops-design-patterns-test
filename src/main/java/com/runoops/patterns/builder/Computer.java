package com.runoops.patterns.builder;

/**
 * 产品：电脑（含 CPU、内存、硬盘、显示器）
 * 参考：https://runoops.com/design-patterns-builder.html
 */
public class Computer {
    private String cpu;
    private String memory;
    private String disk;
    private String screen;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", disk='" + disk + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
