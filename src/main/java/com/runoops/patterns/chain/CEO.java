package com.runoops.patterns.chain;

/**
 * ConcreteHandler: approve leave over 7 days
 */
public class CEO extends Approver {
    @Override
    public void approve(int leaveDays) {
        if (leaveDays > 7) {
            System.out.println("CEO approved leave days: " + leaveDays);
        } else if (nextApprover != null) {
            nextApprover.approve(leaveDays);
        } else {
            System.out.println("No approver can handle this request");
        }
    }
}
