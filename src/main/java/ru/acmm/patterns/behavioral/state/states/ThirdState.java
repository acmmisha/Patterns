/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.state.states;

import ru.acmm.patterns.behavioral.state.Context;
import ru.acmm.patterns.behavioral.state.State;

/**
 * Final state
 *
 * @author tmv
 */
public class ThirdState implements State {

    private final Context context;

    public ThirdState(Context context) {
        this.context = context;
    }

    @Override
    public void doSmth1() {
        //do nothing
    }

    @Override
    public void doSmth2() {
        //do nothing
    }

    @Override
    public String toString() {
        return "ThirdState (Final state).";
    }
}
