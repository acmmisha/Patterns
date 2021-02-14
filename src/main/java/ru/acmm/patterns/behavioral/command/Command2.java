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
public class Command2 implements Command {

    private final Receiver receiver;
    private final List<String> parameters;

    public Command2(Receiver receiver, List<String> parameters) {
        this.receiver = receiver;
        this.parameters = parameters;
    }
    
    @Override
    public void execute() {
        receiver.operation(this);
    }
    
    @Override
    public int priority() {
        return 2;
    }

    @Override
    public String toString() {
        return "Command2";
    }

}
