/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.command;

import java.util.Collections;

/**
 *
 * @author tmv
 */
public class Client {
    
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        
        Command c1 = new Command1(receiver, Collections.EMPTY_LIST);
        Command c2 = new Command1(receiver, Collections.EMPTY_LIST);
        Command c3 = new Command2(receiver, Collections.EMPTY_LIST);
        Command c4 = new Command3(receiver, Collections.EMPTY_LIST);
        Command c5 = new Command1(receiver, Collections.EMPTY_LIST);
        
        c1.execute();
        c2.execute();
        c3.execute();
        c4.execute();
        c5.execute();
        
        receiver.perform();
    }
}
