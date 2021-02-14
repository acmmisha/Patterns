/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author tmv
 */
public class ConcreteMemento implements Memento {

    private final Editor editor;
    private final List<String> states;

    public ConcreteMemento(Editor editor) {
        this.editor = editor;
        states = Arrays.asList(editor.getState1(),
                editor.getState2(),
                editor.getState3());
    }

    @Override
    public void restore() throws UnsupportedOperationException {
           editor.setState1(states.get(0));
           editor.setState2(states.get(1));
           editor.setState3(states.get(2));
    }

}
