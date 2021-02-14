/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.state.states;

import ru.acmm.patterns.behavioral.state.Context;
import ru.acmm.patterns.behavioral.state.State;

/**
 * Intermediate state
 * @author tmv
 */
public class SecondState implements State {
    
    private final Context context;

    public SecondState(Context context) {
        this.context = context;
    }
    
    @Override
    public void doSmth1() {
        System.out.println("Returning to state 1...");
        context.changeState(new FirstState(context));
    }

    @Override
    public void doSmth2() {
        System.out.println("Going to state 3...");
        context.changeState(new ThirdState(context));
    }
        
    @Override
    public String toString() {
        return "SecondState";
    }
}
