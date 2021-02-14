/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.memento;

/**
 * Editor-originator
 * @author tmv
 */
public class Editor {
    
    private String state1;
    private String state2;
    private String state3;

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }
    
    public void save() {
        Memento saveMemento =  new ConcreteMemento(this);
        History.getInstance().addMemento(saveMemento);
    }

    void restore(Memento undoMemento) {
        undoMemento.restore();
    }

    @Override
    public String toString() {
        return "Editor{" + "state1=" + state1 + ", state2=" + state2 + ", state3=" + state3 + '}';
    }
}
