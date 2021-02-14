/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.prototype;

/**
 *
 * @author tmv
 */
public class ConcretePrototype2 implements Prototype {

    private final double field1;
    private final double field2;
    private String field3;

    public ConcretePrototype2(double field1, double field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField3() {
        return field3;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype2 proto = new ConcretePrototype2(this.field1, this.field2);
        proto.setField3(this.getField3());
        return proto;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" + "field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + '}';
    }

}
