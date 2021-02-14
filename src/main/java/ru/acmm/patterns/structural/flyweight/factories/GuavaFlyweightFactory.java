package ru.acmm.patterns.flyweight.factories;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import ru.acmm.patterns.flyweight.Flyweight;
import ru.acmm.patterns.flyweight.FlyweightFactory;

import java.util.Optional;

public class GuavaFlyweightFactory implements FlyweightFactory {

    private final CacheLoader<String, Optional<Flyweight>> loader = new CacheLoader<String, Optional<Flyweight>>() {
        @Override
        public Optional<Flyweight> load(String s) throws Exception {
            return Optional.of(new Flyweight(s));
        }
    };
    private final LoadingCache<String, Optional<Flyweight>> cache = CacheBuilder.newBuilder()
            .recordStats()
            .maximumSize(100)
            .initialCapacity(10)
            .build(loader);

    @Override
    public Optional<Flyweight> getFlyweight(String state) {
        return cache.getUnchecked(state);
    }

    @Override
    public long size() {
        return cache.size();
    }
}
