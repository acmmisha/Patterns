/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.mediator;

import ru.acmm.patterns.behavioral.mediator.components.Component1;
import ru.acmm.patterns.behavioral.mediator.components.Component2;
import ru.acmm.patterns.behavioral.mediator.components.Component3;

/**
 * Concrete Mediator (Controller, Intermediary)
 * @author tmv
 */
public class ConcreteMediator implements Mediator{

    @Override
    public void notify(Component component) {
        if(component instanceof Component1) {
            System.out.println("Doing smth for Component1...");
        } else if(component instanceof Component2){
            System.out.println("Doing smth for Component2...");
        } else if(component instanceof Component3) {
            System.out.println("Doing smth for Component3...");
        }
    }
}
