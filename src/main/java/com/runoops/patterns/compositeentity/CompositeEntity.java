package com.runoops.patterns.compositeentity;

/**
 * Composite Entity: coarse-grained facade for dependents
 */
public class CompositeEntity {
    private final CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String name, String address) {
        cgo.setData(name, address);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
