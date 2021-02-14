/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.state;

import ru.acmm.patterns.behavioral.state.states.FirstState;

/**
 *
 * @author tmv
 */
public class Client {
    
    public static void main(String[] args) {
        Context ctx = new Context();
        State firstState = new FirstState(ctx);
        ctx.changeState(firstState);
        ctx.external();
    }
}
