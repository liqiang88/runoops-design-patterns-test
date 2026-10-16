package com.runoops.patterns.compositeview;

/**
 * Concrete View Component: content
 */
public class ContentView implements ViewComponent {
    private final String content;

    public ContentView(String content) {
        this.content = content;
    }

    @Override
    public void render() {
        System.out.println("Page Content: " + content);
    }
}
