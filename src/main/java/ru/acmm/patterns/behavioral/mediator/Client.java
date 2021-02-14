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
 *
 * @author tmv
 */
public class Client {
    
    public static void main(String[] args) {
        Mediator controller = new ConcreteMediator();
        Component comp1 = new Component1(controller);
        Component comp2 = new Component2(controller);
        Component comp3 = new Component1(controller);
        
        comp1.operation();
        comp2.operation();
        comp3.operation();
    }
}
