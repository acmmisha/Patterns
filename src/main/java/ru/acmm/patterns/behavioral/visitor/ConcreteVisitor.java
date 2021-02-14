/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.visitor;

import ru.acmm.patterns.behavioral.visitor.classes.A;
import ru.acmm.patterns.behavioral.visitor.classes.B;
import ru.acmm.patterns.behavioral.visitor.classes.C;

/**
 *
 * @author tmv
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(A e) {
        System.out.println("Saving info from class A object to file...");
        e.foo1();
    }

    @Override
    public void visit(B e) {
        System.out.println("Saving info from class B object to file...");
        e.foo2();
    }

    @Override
    public void visit(C e) {
        System.out.println("Saving info from class C object to file...");
        e.foo3();
    }
    
}
