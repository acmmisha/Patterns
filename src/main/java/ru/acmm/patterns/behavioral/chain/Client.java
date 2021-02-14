/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.chain;

import java.util.Arrays;
import ru.acmm.patterns.behavioral.chain.components.Button;
import ru.acmm.patterns.behavioral.chain.components.Component;
import ru.acmm.patterns.behavioral.chain.components.Dialog;
import ru.acmm.patterns.behavioral.chain.components.Menu;
import ru.acmm.patterns.behavioral.chain.components.Panel;

/**
 *
 * @author tmv
 */
public class Client {
    
    public static void main(String[] args) {
        Dialog dlg = new Dialog();
        Panel panel1 = new Panel("Panel#1");
        Panel panel2 = new Panel("Panel#2");
        Menu menu1 = new Menu();
        panel1.addChild(menu1);
        Button button1 = new Button();
        panel2.addChild(button1);
        
        dlg.addChild(panel1);
        dlg.addChild(panel2);
        
        button1.showHelp(Arrays.asList("param1", "param2"));
    }
    
    
}
