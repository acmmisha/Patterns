/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.chain.components;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author tmv
 */
public class Menu extends Component {

    @Override
    public void showHelp(List<String> properties) {
        String props = properties.stream().collect(Collectors.joining(" "));
        System.out.println("Tooltip for menu with props: " + props);
    }
}
