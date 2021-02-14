package ru.acmm.patterns.decorator;

public class Panel implements Component {

    @Override
    public void paint() {
        System.out.println("Painting a panel...");
    }
}
