/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.factory.client.factory;

import ru.acmm.patterns.creational.factory.product.ProductA;
import ru.acmm.patterns.creational.factory.product.ProductB;
import ru.acmm.patterns.creational.factory.product.ProductC;

/**
 * Абстрактная фабрика, с которой оперирует клиент (клиентское приложение)
 * @author tmv
 */
public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
    ProductC createProductC();
}
