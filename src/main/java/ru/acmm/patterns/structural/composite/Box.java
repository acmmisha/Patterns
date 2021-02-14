package ru.acmm.patterns.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Box implements Item {

    private final String name;
    private final List<Item> items = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public boolean addItem(Item item) {
        return items.add(item);
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public Stream<Item> items() {
        return items.stream();
    }

    @Override
    public double getPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
}
