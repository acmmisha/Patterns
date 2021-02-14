/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.factorymethod.logistic;

import ru.acmm.patterns.creational.factorymethod.transport.Railroad;
import ru.acmm.patterns.creational.factorymethod.transport.Transport;

/**
 *
 * @author tmv
 */
public class RailroadLogistic extends Logistic {

    @Override
    public Transport createLogistic() {
        return new Railroad();
    }

    @Override
    public void send() {
        System.out.println("Sending by railroad");
    }
}
