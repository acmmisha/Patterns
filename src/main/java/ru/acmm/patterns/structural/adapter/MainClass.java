package ru.acmm.patterns.adapter;

public class MainClass {

    public static void main(String[] args) {
        ClientInterface c = new Adapter(new Service());
        c.usefulMethod();
    }
}
