package com.runoops.patterns.chain;

/**
 * ConcreteHandler: approve leave within 3 days
 */
public class Supervisor extends Approver {
    @Override
    public void approve(int leaveDays) {
        if (leaveDays <= 3) {
            System.out.println("Supervisor approved leave days: " + leaveDays);
        } else if (nextApprover != null) {
            nextApprover.approve(leaveDays);
        } else {
            System.out.println("No approver can handle this request");
        }
    }
}
