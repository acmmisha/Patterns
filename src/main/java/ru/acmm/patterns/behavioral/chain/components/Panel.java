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
 *
 * @author tmv
 */
public class Panel extends Component {

    private final String name;
    private final List<Component> components = new ArrayList<>();
    
    public Panel(String name) {
        this.name = name;
    }
    
    @Override
    public void showHelp(List<String> properties) {
        String props = properties.stream().collect(Collectors.joining(" "));
        System.out.println("Tooltip for panel: " + name + " with props: " + props);
//        if(next != null)
//            next.showHelp(properties);
    }
    
    public void addChild(Component component) {
        component.setNext(this);
        components.add(component);
    }
    
    public Stream<Component> components() {
        return components.stream();
    }
}
