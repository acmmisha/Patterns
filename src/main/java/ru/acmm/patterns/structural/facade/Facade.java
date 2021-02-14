package ru.acmm.patterns.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Facade to subsystems: Realisation details hidden
 */
public class Facade {

    //list of complex subsystems
    private final List<Subsystem> subsystems = new ArrayList<>();
    private final List<Facade> additionalFacades = new ArrayList<>();

    public void executeSmth() {
        subsystems.forEach(Subsystem::execute);
        additionalFacades.forEach(Facade::executeSmth);
    }

    public boolean addAdditionalFacade(Facade facade) {
        return facade == this ? false : additionalFacades.add(facade);
    }

    public boolean addSubsystem(Subsystem subsystem) {
        return subsystems.add(subsystem);
    }

    public boolean removeSubsystem(Subsystem subsystem) {
        return subsystems.remove(subsystem);
    }

    public Stream<Subsystem> subsystems() {
        return subsystems.stream();
    }
}
