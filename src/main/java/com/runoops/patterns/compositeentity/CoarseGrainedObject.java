package com.runoops.patterns.compositeentity;

/**
 * Coarse Grained Object: hold dependent objects
 */
public class CoarseGrainedObject {
    private final DependentObject1 do1 = new DependentObject1();
    private final DependentObject2 do2 = new DependentObject2();

    public void setData(String name, String address) {
        do1.setUserName(name);
        do2.setAddress(address);
    }

    public String[] getData() {
        return new String[]{do1.getUserName(), do2.getAddress()};
    }
}
