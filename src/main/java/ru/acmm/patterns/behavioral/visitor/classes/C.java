/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.visitor.classes;

import ru.acmm.patterns.behavioral.visitor.Visitable;
import ru.acmm.patterns.behavioral.visitor.Visitor;

/**
 *
 * @author tmv
 */
public class C implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public void foo3() {
        System.out.println("Excuting foo3() method...");
    }
}
