/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.builder.builders;

/**
 *
 * @author tmv
 */
public interface Builder {

    public abstract Builder step1(String step1);

    public abstract Builder step2(String step2);

    public abstract Builder step3(String step3);

    public abstract Product build();
}
