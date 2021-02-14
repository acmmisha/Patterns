/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.command;

import java.util.List;

/**
 *
 * @author tmv
 */
public class Command3 implements Command {

    private final Receiver receiver;
    private final List<String> parameters;

    public Command3(Receiver receiver, List<String> parameters) {
        this.receiver = receiver;
        this.parameters = parameters;
    }

    @Override
    public void execute() {
        receiver.operation(this);
    }

    @Override
    public int priority() {
        return 1;
    }

    @Override
    public String toString() {
        return "Command3";
    }

}
