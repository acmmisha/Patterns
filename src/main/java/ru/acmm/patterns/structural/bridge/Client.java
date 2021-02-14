package ru.acmm.patterns.bridge;

import ru.acmm.patterns.bridge.abstractions.Figure;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Client {

    private final List<? super Figure> figures = new ArrayList<>();

    public boolean addFigure(Figure figure) {
        return figures.add(figure);
    }

    public Stream<? super Figure> figures() {
        return figures.stream();
    }
}
