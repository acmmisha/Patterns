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
public class ConcretePrototype1 implements Prototype {

    private final int field1;
    private final int field2;
    private int field3;

    public ConcretePrototype1(int field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }
    
    public void setField3(int field3) {
        this.field3 = field3;
    }

    public int getField3() {
        return field3;
    }
    
    @Override
    public Prototype clone() {
        ConcretePrototype1 proto = new ConcretePrototype1(this.field1, this.field2);
        proto.setField3(this.getField3());
        return proto;
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" + "field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + '}';
    }
    
}
