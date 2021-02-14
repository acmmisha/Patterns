/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.builder.builders;

import ru.acmm.patterns.creational.builder.builders.Builder;

/**
 *
 * @author tmv
 */
public class Product {

    private Builder builder;
    private String step1;
    private String step2;
    private String step3;
    
    Product() {
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    void setStep1(String step1) {
        this.step1 = step1;
    }

    void setStep2(String step2) {
        this.step2 = step2;
    }

    void setStep3(String step3) {
        this.step3 = step3;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getStep1() {
        return step1;
    }

    public String getStep2() {
        return step2;
    }

    public String getStep3() {
        return step3;
    }

    @Override
    public String toString() {
        return "Product{" + "step1=" + step1 + ", step2=" + step2 + ", step3=" + step3 + '}';
    }
}
