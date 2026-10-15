package com.runoops.patterns.composite;

/**
 * 叶子构件：文件
 */
public class File extends FileSystemNode {
    public File(String name) {
        super(name);
    }

    @Override
    public void show(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
