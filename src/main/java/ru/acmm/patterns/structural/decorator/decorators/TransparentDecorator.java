package ru.acmm.patterns.decorator.decorators;

import ru.acmm.patterns.decorator.Component;
import ru.acmm.patterns.decorator.Decorator;

public class TransparentDecorator extends Decorator {

    private final Component component;

    public TransparentDecorator(Component component) {
        super(component);
        this.component = component;
    }

    @Override
    public void paint() {
        super.paint();
        System.out.println("Adding some extra transparent props...");
    }
}
