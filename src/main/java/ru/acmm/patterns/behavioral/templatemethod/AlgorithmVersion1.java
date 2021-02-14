/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.templatemethod;

/**
 *
 * @author tmv
 */
public class AlgorithmVersion1 extends BasicAlgorithm {

    @Override
    protected void step1() {
        System.out.println("Performing step 1 in algo version#1");
    }
    
    @Override
    protected void step2() {
        System.out.println("Performing step 2 in algo version#1");
    }

    @Override
    protected void step3() {
        System.out.println("Performing step 3 in algo version#1");
    }
}
