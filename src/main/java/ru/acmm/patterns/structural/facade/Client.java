package ru.acmm.patterns.facade;

public class Client {

    public static void main(String[] args) {
        class ConcreteSubsystem1 implements Subsystem {
            @Override
            public void execute() {
                System.out.println("Doing smth in subsystem#1...");
            }
        }

        class ConcreteSubsystem2 implements Subsystem {
            @Override
            public void execute() {
                System.out.println("Doing smth in subsystem#2...");
            }
        }

        Facade mainFacade = new Facade();
        Facade additionalFacade = new Facade();
        mainFacade.addAdditionalFacade(additionalFacade);

        ConcreteSubsystem1 sub1 = new ConcreteSubsystem1();
        ConcreteSubsystem2 sub2 = new ConcreteSubsystem2();
        ConcreteSubsystem2 sub3 = new ConcreteSubsystem2();
        additionalFacade.addSubsystem(sub3);
        mainFacade.addSubsystem(sub1);
        mainFacade.addSubsystem(sub2);

        mainFacade.executeSmth();
    }
}
