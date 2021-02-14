/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.factorymethod.logistic;

import ru.acmm.patterns.creational.factorymethod.transport.Transport;

/**
 * Abstract class to describe general transport logistic
 * @author tmv
 */
public abstract class Logistic {
    
    public void send() {
        System.out.println("Unknown transport sending");
    }
    /**
     * Factory method for choosing transport logistic
     * @return выбранный для перевозки груза транспорт
     * @see Transport
     */
    public abstract Transport createLogistic();
}
