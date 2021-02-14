/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.mediator;

/**
 * Abstraction of a component
 * @author tmv
 */
public abstract class Component {
    
    private final Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }
    
    public void operation() {
        mediator.notify(this);
    }
}
