package ru.acmm.patterns.bridge.abstractions;

public abstract class Figure {

    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getColorDescription() {
        return color.getColorCode();
    }

}
