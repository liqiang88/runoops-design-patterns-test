package com.runoops.patterns.transferobject;

/**
 * Business Object: assemble / update transfer object
 */
public class StudentBO {
    // simulate DB
    public StudentTO getStudent() {
        // query data and assemble transfer object
        return new StudentTO("Tom", 10001);
    }

    public void updateStudent(StudentTO studentTO) {
        studentTO.setName("Tom Updated");
        System.out.println("Update student in DB, new name: " + studentTO.getName());
    }
}
