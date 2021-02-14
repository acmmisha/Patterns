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
public class Client {

    public static void main(String[] args) {
        BasicAlgorithm algo = new AlgorithmVersion1();
        algo.calculate();
        algo = new AlgorithmVersion2();
        algo.calculate();
    }
}
