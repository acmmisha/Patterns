/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.state;

import java.util.Objects;

/**
 *
 * @author tmv
 */
public class Context {
    
    private State state;
    
    public void changeState(State change) {
        this.state = Objects.requireNonNull(change, "State cannot be null!!!");
    }

    public void external() {
        System.out.println(state);
        state.doSmth1();
        System.out.println(state);
        state.doSmth1();
        System.out.println(state);
        state.doSmth2();
        System.out.println(state);
    }
}
