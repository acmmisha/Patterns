/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.builder.client;

import ru.acmm.patterns.creational.builder.builders.Builder1;
import ru.acmm.patterns.creational.builder.builders.Builder2;

/**
 *
 * @author tmv
 */
public class Client {
    
    public static void main(String[] args) {
        Director director = new Director(new Builder2());
        System.out.println(director.make());
        director.changeBuilder(new Builder1());
        System.out.println(director.make());
    }
}
