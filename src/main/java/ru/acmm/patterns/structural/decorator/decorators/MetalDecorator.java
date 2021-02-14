package ru.acmm.patterns.decorator.decorators;

import ru.acmm.patterns.decorator.Component;
import ru.acmm.patterns.decorator.Decorator;

public class MetalDecorator extends Decorator {

    private final Component component;

    public MetalDecorator(Component component) {
        super(component);
        this.component = component;
    }

    @Override
    public void paint() {
        super.paint();
        System.out.println("Adding some extra metal props...");
    }
}
