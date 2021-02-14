package ru.acmm.patterns.proxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        RemoteService remote = new RealRemoteService();
        RemoteService proxy =
                (RemoteService) Proxy.newProxyInstance(RealRemoteService.class.getClassLoader(),
                        RealRemoteService.class.getInterfaces(),
                        new MyInvocationHandler(remote));
        proxy.execute();
    }
}
