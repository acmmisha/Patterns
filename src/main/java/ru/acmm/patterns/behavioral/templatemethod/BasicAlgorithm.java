/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.templatemethod;

/**
 * Basic algorithm class with template method
 * @author tmv
 */
public abstract class BasicAlgorithm {
    
    //Template method: must be final!!!
    public final void calculate() {
        step1();
        step2();
        step3();
        step4();
        step5();
    }

    protected void step1() {
        System.out.println("Performing step 1 in basic algo");
    }

    protected abstract void step2();

    protected abstract void step3();

    protected void step4() {
        System.out.println("Performing step 4 in basic algo");
    }

    protected void step5() {
        System.out.println("Performing step 5 in basic algo");
    }
}
