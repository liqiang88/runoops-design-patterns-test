package com.runoops.patterns.compositeview;

/**
 * Composite View pattern demo (client)
 * Article: https://runoops.com/design-patterns-composite-view.html
 *
 * Page = Header + Content + Footer fragments.
 */
public class CompositeViewDemo {

    public static void main(String[] args) {
        CompositeView page = new CompositeView();
        page.addComponent(new HeaderView());
        page.addComponent(new ContentView("Hello Composite View Pattern"));
        page.addComponent(new FooterView());
        page.render();
    }
}
