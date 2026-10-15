package com.runoops.patterns.chain;

/**
 * Handler: abstract leave approver
 * Ref: https://runoops.com/design-patterns-chain.html
 */
public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approve(int leaveDays);
}
