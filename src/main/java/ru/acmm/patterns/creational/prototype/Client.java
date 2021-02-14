/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.prototype;

import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author tmv
 */
public class Client {

    public static void main(String[] args) {
        ConcretePrototype1 proto1 = new ConcretePrototype1(4, 5);
        proto1.setField3(777);
        ConcretePrototype2 proto2 = new ConcretePrototype2(10d, 11d);
        proto2.setField3("Helloo!");
        
        List<Prototype> protos = Arrays.asList(proto1, proto2);
        
        //создаем клоны исходных объектов
        List<Prototype> clones = 
                protos.stream()
                        .map(Prototype::clone)
                        .collect(toList());
        
        clones.addAll(protos);//здесь и оригиналы и их клоны
        clones.forEach(System.out::println);

//        Cloneable c;
    }
}
