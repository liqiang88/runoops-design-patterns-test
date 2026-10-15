package com.runoops.patterns.chain;

/**
 * ConcreteHandler: approve leave between 3 and 7 days
 */
public class Manager extends Approver {
    @Override
    public void approve(int leaveDays) {
        if (leaveDays > 3 && leaveDays <= 7) {
            System.out.println("Manager approved leave days: " + leaveDays);
        } else if (nextApprover != null) {
            nextApprover.approve(leaveDays);
        } else {
            System.out.println("No approver can handle this request");
        }
    }
}
