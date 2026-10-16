package com.runoops.patterns.compositeview;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite View: assemble and render child components
 */
public class CompositeView implements ViewComponent {
    private final List<ViewComponent> componentList = new ArrayList<>();

    public void addComponent(ViewComponent component) {
        componentList.add(component);
    }

    @Override
    public void render() {
        for (ViewComponent component : componentList) {
            component.render();
        }
    }
}
