package ru.acmm.patterns.adapter;

public class Adapter implements ClientInterface {

    private final Service libService;

    public Adapter(Service libService) {
        this.libService = libService;
    }

    @Override
    public void usefulMethod() {
        libService.doUsefulWork();
    }
}
