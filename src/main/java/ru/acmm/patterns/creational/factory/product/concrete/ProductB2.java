/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.factory.product.concrete;

import ru.acmm.patterns.creational.factory.product.ProductB;

/**
 *
 * @author tmv
 */
public class ProductB2 extends ProductB {

    @Override
    public Double price() {
        return 4d;
    }
}
