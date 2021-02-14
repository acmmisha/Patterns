/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.builder.builders;

/**
 * Second example of my Builder
 * @author tmv
 */
public class Builder2 implements Builder {

    private String step1;
    private String step2 = "default";
    private String step3;

    @Override
    public Builder step1(String step1) {
        this.step1 = step1;
        return this;
    }

    @Override
    public Builder step2(String step2) {
        return this;
    }

    @Override
    public Builder step3(String step3) {
        this.step3 = step3;
        return this;
    }

    @Override
    public Product build() {
        Product product = new Product();
        product.setStep1(step1);
        product.setStep2(step2);
        product.setStep3(step3);
        return product;
    }

}
