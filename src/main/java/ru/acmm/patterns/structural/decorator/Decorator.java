package ru.acmm.patterns.decorator;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void paint() {
        component.paint();
    }
}
