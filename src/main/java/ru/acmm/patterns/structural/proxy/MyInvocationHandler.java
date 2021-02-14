package ru.acmm.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private final RemoteService service;

    public MyInvocationHandler(RemoteService service) {
        this.service = service;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().equals("execute")) {
                System.out.println("Doing additional job...");
            }
            return method.invoke(service, args);
        } finally {
            System.out.println("Doing finalizing job...");
        }
    }
}
