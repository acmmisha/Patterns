package ru.acmm.patterns.flyweight;

import ru.acmm.patterns.flyweight.factories.GuavaFlyweightFactory;
import ru.acmm.patterns.flyweight.factories.SimpleFlyweightFactory;

public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new GuavaFlyweightFactory();
        Context ctx1 = new Context();
        ctx1.setUniqueState("Unique1");
        ctx1.setFlyweight(factory.getFlyweight("state1"));
        Context ctx2 = new Context();
        ctx2.setUniqueState("Unique2");
        ctx2.setFlyweight(factory.getFlyweight("state2"));
        Context ctx3 = new Context();
        ctx3.setUniqueState("Unique2");
        ctx3.setFlyweight(factory.getFlyweight("state1"));
        Context ctx4 = new Context();
        ctx4.setUniqueState("Unique2");
        ctx4.setFlyweight(factory.getFlyweight("state1"));

        System.out.println(factory.size());
    }
}
