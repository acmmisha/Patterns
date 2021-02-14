/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.factory.product.concrete;

import ru.acmm.patterns.creational.factory.product.ProductA;

/**
 *
 * @author tmv
 */
public class ProductA2 extends ProductA {
        @Override
    public Double price() {
        return 2d;
    }
}
