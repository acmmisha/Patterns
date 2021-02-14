/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.strategy;

import ru.acmm.patterns.behavioral.strategies.AutoRouteStrategy;
import ru.acmm.patterns.behavioral.strategies.PedestrianRouteStrategy;
import ru.acmm.patterns.behavioral.strategies.TouristRouteStrategy;

/**
 *
 * @author tmv
 */
public class Client {
    
    public static void main(String[] args) {
        RouteStrategy initialRouteStrategy = new AutoRouteStrategy();
        Navigator navigator = new Navigator(initialRouteStrategy);
        navigator.doSmth();
        navigator.setRouteStrategy(new PedestrianRouteStrategy());
        navigator.doSmth();
        navigator.setRouteStrategy(new TouristRouteStrategy());
        navigator.doSmth();
    }
}
