package ru.acmm.patterns.bridge.colors;

import ru.acmm.patterns.bridge.abstractions.Color;

public class Blue implements Color {
    @Override
    public int getColorCode() {
        return 0x0000FF;
    }
}
