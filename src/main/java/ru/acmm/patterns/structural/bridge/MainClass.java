package ru.acmm.patterns.bridge;

import ru.acmm.patterns.bridge.abstractions.Figure;
import ru.acmm.patterns.bridge.colors.Blue;
import ru.acmm.patterns.bridge.colors.Green;
import ru.acmm.patterns.bridge.colors.Red;
import ru.acmm.patterns.bridge.figures.Circle;
import ru.acmm.patterns.bridge.figures.Rectangle;

public class MainClass {

    public static void main(String[] args) {
        Client client = new Client();
        client.addFigure(new Circle(new Red()));
        client.addFigure(new Rectangle(new Blue()));
        client.addFigure(new Circle(new Green()));

        client.figures()
                .map(Figure.class::cast)
                .mapToInt(Figure::getColorDescription)
                .mapToObj(Integer::toHexString)
                .forEach(System.out::println);

    }
}
