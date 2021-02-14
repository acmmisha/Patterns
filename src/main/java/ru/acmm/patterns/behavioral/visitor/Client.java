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
public class Client {
    
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        A a = new A();
        B b = new B();
        C c = new C();
        a.accept(visitor);
        b.accept(visitor);
        c.accept(visitor);
    }
}
