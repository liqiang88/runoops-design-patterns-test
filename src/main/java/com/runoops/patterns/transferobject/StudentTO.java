package com.runoops.patterns.transferobject;

/**
 * Transfer Object (DTO): data carrier only
 * Ref: https://runoops.com/design-patterns-transer-object.html
 */
public class StudentTO {
    private String name;
    private int rollNo;

    public StudentTO(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
