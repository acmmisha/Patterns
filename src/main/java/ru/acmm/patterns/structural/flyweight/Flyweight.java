package ru.acmm.patterns.flyweight;

public class Flyweight {
    private final String state;

    public Flyweight(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void operation() {
        System.out.println(state);
    }
}
