/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.builder.client;

import java.util.Objects;
import ru.acmm.patterns.creational.builder.builders.Builder;
import ru.acmm.patterns.creational.builder.builders.Product;

/**
 *
 * @author tmv
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = Objects.requireNonNull(builder, "Builder must not be null!");
    }
    
    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }
    
    public Product make() {
        return builder.step1("A").step2("B").step3("C").build();
    }
}
