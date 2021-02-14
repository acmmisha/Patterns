/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.memento;

/**
 *
 * @author tmv
 */
public interface Memento {
    void restore() throws UnsupportedOperationException;
}
