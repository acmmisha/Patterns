package ru.acmm.patterns.proxy;

public class RealRemoteService implements RemoteService {

    @Override
    public void execute() {
        System.out.println("Executing remote service...");
    }
}
