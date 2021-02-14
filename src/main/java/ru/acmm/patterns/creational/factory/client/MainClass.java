/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.factory.client;

import ru.acmm.patterns.creational.factory.client.factory.FirstFactory;
import ru.acmm.patterns.creational.factory.client.factory.SecondFactory;

/**
 *
 * @author tmv
 */
public class MainClass {
 
    public static void main(String[] args) {
//        Client client = new Client(new SecondFactory());
        Client client = new Client(new FirstFactory());
        client.produce().forEach(p -> System.out.println(p.price()));
    }
}
