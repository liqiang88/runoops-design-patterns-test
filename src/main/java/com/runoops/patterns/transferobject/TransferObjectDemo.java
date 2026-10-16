package com.runoops.patterns.transferobject;

/**
 * Transfer Object pattern demo (client)
 * Article: https://runoops.com/design-patterns-transer-object.html
 *
 * Client receives StudentTO from BO and sends updates back.
 */
public class TransferObjectDemo {

    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();

        // get transfer object
        StudentTO studentTO = studentBO.getStudent();
        System.out.println("Student Name: " + studentTO.getName());
        System.out.println("Roll No: " + studentTO.getRollNo());

        // modify transfer object and send back for update
        studentTO.setName("Tom New");
        studentBO.updateStudent(studentTO);
    }
}
