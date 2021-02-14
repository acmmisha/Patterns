package ru.acmm.patterns.flyweight;

import java.util.Optional;

public interface FlyweightFactory {
    Optional<Flyweight> getFlyweight(String state);
    long size();
}
