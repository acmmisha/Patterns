/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.acmm.patterns.behavioral.strategy;

import java.util.List;
import javafx.geometry.Point2D;

/**
 *
 * @author tmv
 */
public interface RouteStrategy {
    List<Point2D> calculateRoute(Point2D a, Point2D b);
}
