/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.chain.components;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * GUI dialog class
 * @author tmv
 */
public class Dialog extends Component {

    private final List<Component> components = new ArrayList<>();
    
    @Override
    public void showHelp(List<String> properties) {
        String props = properties.stream().collect(Collectors.joining(" "));
        System.out.println("Tooltip for dialog with props: " + props);
    }
    
    public boolean addChild(Component component) {
        component.setNext(this);
        return components.add(component);
    }
    
    public Stream<Component> components() {
        return components.stream();
    }
}
