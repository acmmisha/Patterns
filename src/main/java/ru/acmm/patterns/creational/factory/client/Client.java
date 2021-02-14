/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.factory.client;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import ru.acmm.patterns.creational.factory.client.factory.AbstractFactory;
import ru.acmm.patterns.creational.factory.product.Product;

/**
 *
 * @author tmv
 */
public class Client {

    private final AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public Stream<Product> produce() {
        return Arrays.asList(
                factory.createProductA(),
                factory.createProductB(),
                factory.createProductC()).stream();
    }
    
}
