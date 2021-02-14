/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.strategy;

import javafx.geometry.Point2D;

/**
 * Context class Navigator
 * @author tmv
 */
public class Navigator {
    
    private RouteStrategy routeStrategy;
    
    public Navigator(RouteStrategy strategy) {
        this.routeStrategy = strategy;
    }

    public RouteStrategy getRouteStrategy() {
        return routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }
    
    public void doSmth() {
        this.routeStrategy.calculateRoute(new Point2D(10, 10), new Point2D(30, 30));
    }
}
