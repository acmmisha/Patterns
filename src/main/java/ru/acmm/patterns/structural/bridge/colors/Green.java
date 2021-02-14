package ru.acmm.patterns.bridge.colors;

import ru.acmm.patterns.bridge.abstractions.Color;

public class Green implements Color {
    @Override
    public int getColorCode() {
        return 0x00FF00;
    }
}
