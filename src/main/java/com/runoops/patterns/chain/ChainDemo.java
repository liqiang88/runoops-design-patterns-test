package com.runoops.patterns.chain;

/**
 * Chain of Responsibility demo (client)
 * Article: https://runoops.com/design-patterns-chain.html
 *
 * Leave request flows: Supervisor -> Manager -> CEO
 */
public class ChainDemo {

    public static void main(String[] args) {
        Approver supervisor = new Supervisor();
        Approver manager = new Manager();
        Approver ceo = new CEO();

        // build chain
        supervisor.setNextApprover(manager);
        manager.setNextApprover(ceo);

        supervisor.approve(2);
        supervisor.approve(5);
        supervisor.approve(10);
    }
}
