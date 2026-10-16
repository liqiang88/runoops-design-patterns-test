package com.runoops.patterns.viewhelper;

/**
 * Model: user
 * Ref: https://runoops.com/design-patterns-view-helper.html
 */
public class User {
    private Integer id;
    private String name;
    private String registerTime;

    public User(Integer id, String name, String registerTime) {
        this.id = id;
        this.name = name;
        this.registerTime = registerTime;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegisterTime() {
        return registerTime;
    }
}
