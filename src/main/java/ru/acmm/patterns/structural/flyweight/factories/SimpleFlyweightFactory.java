package ru.acmm.patterns.flyweight.factories;

import ru.acmm.patterns.flyweight.Flyweight;
import ru.acmm.patterns.flyweight.FlyweightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SimpleFlyweightFactory implements FlyweightFactory {

    private final List<Flyweight> cache = new ArrayList<>();

    @Override
    public synchronized long size() {
        return cache.size();
    }

    @Override
    public synchronized Optional<Flyweight> getFlyweight(String state) {
        if(cache.stream().noneMatch(f -> state.equals(f.getState()))) {
            cache.add(new Flyweight(state));
        }
        return cache.stream().filter(f -> state.equals(f.getState())).findFirst();
    }
}
