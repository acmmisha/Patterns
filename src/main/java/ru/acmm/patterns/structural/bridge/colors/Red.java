package ru.acmm.patterns.bridge.colors;

import ru.acmm.patterns.bridge.abstractions.Color;

public class Red implements Color {

    @Override
    public int getColorCode() {
        return 0xFF0000;
    }
}
