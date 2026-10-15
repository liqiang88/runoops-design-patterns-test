package com.runoops.patterns.composite;

/**
 * 组合模式演示（客户端）
 * 文章：https://runoops.com/design-patterns-composite.html
 *
 * 客户端只依赖 FileSystemNode，统一调用 show，不用区分文件或文件夹。
 */
public class CompositeDemo {

    public static void main(String[] args) {
        FileSystemNode root = new Folder("根目录");
        FileSystemNode docFolder = new Folder("文档");
        FileSystemNode picFolder = new Folder("图片");

        FileSystemNode readme = new File("readme.txt");
        FileSystemNode photo = new File("风景.jpg");

        docFolder.add(readme);
        picFolder.add(photo);
        root.add(docFolder);
        root.add(picFolder);

        root.show(0);
    }
}
