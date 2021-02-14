/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.chain.components;

import java.util.List;
import ru.acmm.patterns.behavioral.chain.ComponentWithHelp;

/**
 *
 * @author tmv
 */
public abstract class Component implements ComponentWithHelp {
    
    protected ComponentWithHelp next;
    
    public void setNext(ComponentWithHelp component) {
        this.next = component;
    }
            
    @Override
    public void showHelp(List<String> properties) {
        if(next != null) {
            next.showHelp(properties);
        }
    }

}
