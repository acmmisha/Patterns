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
public interface Visitor {
    void visit(A e);
    void visit(B e);
    void visit(C e);
}
