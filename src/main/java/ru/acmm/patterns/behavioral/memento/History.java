/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Caretaker- singleton class History 
 * @author tmv
 */
public final class History {

    private static History instance;
    private final Deque<Memento> editorHistory = new ArrayDeque<>();
    
    private History() {}
    
    public static History getInstance() {
        if(instance == null) {
            instance = new History();
        }
        return instance;
    }

    public void addMemento(Memento memento) {
        editorHistory.push(memento);
    }

    public Memento undo() {
        return editorHistory.pop();
    }
}
