package com.runoops.patterns.builder;

/**
 * 建造者模式演示（客户端）
 * 文章：https://runoops.com/design-patterns-builder.html
 *
 * 相同构建流程，通过不同建造者生成高配 / 低配电脑。
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Director director = new Director();

        // 构建高配电脑
        ComputerBuilder highBuilder = new HighConfigComputerBuilder();
        Computer highPc = director.construct(highBuilder);
        System.out.println("高配电脑：" + highPc);

        // 构建低配电脑
        ComputerBuilder lowBuilder = new LowConfigComputerBuilder();
        Computer lowPc = director.construct(lowBuilder);
        System.out.println("低配电脑：" + lowPc);
    }
}
