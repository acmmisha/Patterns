/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.mediator.components;

import ru.acmm.patterns.behavioral.mediator.Component;
import ru.acmm.patterns.behavioral.mediator.Mediator;

/**
 *
 * @author tmv
 */
public class Component2 extends Component {

    public Component2(Mediator mediator) {
        super(mediator);
    }
    
    @Override
    public void operation() {
        System.out.println("Doin smth internal in Component2");
        super.operation();
    }
}
