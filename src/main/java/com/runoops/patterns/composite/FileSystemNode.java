package com.runoops.patterns.composite;

/**
 * 抽象构件：文件与文件夹统一接口（透明模式）
 * 参考：https://runoops.com/design-patterns-composite.html
 */
public abstract class FileSystemNode {
    protected String name;

    public FileSystemNode(String name) {
        this.name = name;
    }

    public abstract void show(int depth);

    // 容器节点才需要的方法，叶子节点空实现
    public boolean add(FileSystemNode node) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(FileSystemNode node) {
        throw new UnsupportedOperationException();
    }
}
