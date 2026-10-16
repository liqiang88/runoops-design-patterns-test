package com.runoops.patterns.compositeentity;

/**
 * Dependent Object: user name
 * Ref: https://runoops.com/design-patterns-composite-entiy.html
 */
public class DependentObject1 {
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
