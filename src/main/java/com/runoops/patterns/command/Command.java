package com.runoops.patterns.command;

/**
 * Command: abstract command with execute / undo
 * Ref: https://runoops.com/design-patterns-command.html
 */
public interface Command {
    void execute();

    void undo();
}
