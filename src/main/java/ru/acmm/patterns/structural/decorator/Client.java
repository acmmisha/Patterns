package ru.acmm.patterns.decorator;

import ru.acmm.patterns.decorator.decorators.MetalDecorator;
import ru.acmm.patterns.decorator.decorators.TransparentDecorator;

public class Client {

    public static void main(String[] args) {
        Panel panel = new Panel();
        Decorator decor = new MetalDecorator(new TransparentDecorator(panel));
        decor.paint();
    }
}
