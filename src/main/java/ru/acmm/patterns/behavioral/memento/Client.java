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
public class Client {
    
    
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setState1("1");
        editor.setState2("2");
        editor.setState3("3");
        System.out.println(editor);
        
        editor.save();
        
        editor.setState1("7");
        editor.setState2("8");
        editor.setState3("9");
        System.out.println(editor);
        History.getInstance().undo().restore();
        System.out.println(editor);
    }
}
