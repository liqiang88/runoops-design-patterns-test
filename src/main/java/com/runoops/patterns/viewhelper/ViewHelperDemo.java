package com.runoops.patterns.viewhelper;

/**
 * View Helper pattern demo (client)
 * Article: https://runoops.com/design-patterns-view-helper.html
 *
 * View only renders; helper fetches and formats data.
 */
public class ViewHelperDemo {

    public static void main(String[] args) {
        UserViewHelper helper = new UserViewHelper();
        UserView view = new UserView(helper);
        view.render();
    }
}
