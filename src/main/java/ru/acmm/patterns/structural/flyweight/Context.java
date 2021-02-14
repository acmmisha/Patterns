package ru.acmm.patterns.flyweight;

import java.util.Optional;

public class Context {

    private String uniqueState;
    private Flyweight flyweight;

    public String getUniqueState() {
        return uniqueState;
    }

    public void setUniqueState(String uniqueState) {
        this.uniqueState = uniqueState;
    }

    public Flyweight getFlyweight() {
        return flyweight;
    }

    public void setFlyweight(Optional<Flyweight> flyweight) {
        this.flyweight = flyweight.get();
    }
}
