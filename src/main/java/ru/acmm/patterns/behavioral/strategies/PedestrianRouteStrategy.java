/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.strategies;

import java.util.Collections;
import javafx.geometry.Point2D;
import java.util.List;
import ru.acmm.patterns.behavioral.strategy.RouteStrategy;

/**
 *
 * @author tmv
 */
public class PedestrianRouteStrategy implements RouteStrategy {

    @Override
    public List<Point2D> calculateRoute(Point2D a, Point2D b) {
        System.out.println("Forming a pedestrian route from point " + a + " to point " + b);
        return Collections.EMPTY_LIST;
    }
    
}
