/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.creational.factorymethod.transport;

/**
 * Abstract transport
 * @author tmv
 */
public interface Transport {
    public abstract void load();
    public abstract void unload();
    public abstract void deliver();
    
}
