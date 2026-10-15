package com.runoops.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件：文件夹
 */
public class Folder extends FileSystemNode {
    private final List<FileSystemNode> childList = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public boolean add(FileSystemNode node) {
        childList.add(node);
        return true;
    }

    @Override
    public boolean remove(FileSystemNode node) {
        childList.remove(node);
        return true;
    }

    @Override
    public void show(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (FileSystemNode child : childList) {
            child.show(depth + 1);
        }
    }
}
