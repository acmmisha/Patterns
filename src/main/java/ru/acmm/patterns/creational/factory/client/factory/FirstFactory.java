/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.factory.client.factory;

import ru.acmm.patterns.creational.factory.product.ProductA;
import ru.acmm.patterns.creational.factory.product.ProductB;
import ru.acmm.patterns.creational.factory.product.ProductC;
import ru.acmm.patterns.creational.factory.product.concrete.ProductA1;
import ru.acmm.patterns.creational.factory.product.concrete.ProductB1;
import ru.acmm.patterns.creational.factory.product.concrete.ProductC1;

/**
 * Первый вариант фабрики-поставщика неких продуктов
 * @author tmv
 */
public class FirstFactory implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }

    @Override
    public ProductC createProductC() {
        return new ProductC1();
    }
}
