package com.epam.elearn.aggregationAndСomposition.second;

public class Wheel {
    private int diameter;
    private boolean quality;

    public Wheel(int diameter) {
        this.diameter = diameter;
        quality = true;
    }

    int getDiameter() {
        return diameter;
    }

    boolean isQuality() {
        return quality;
    }

    public void breakWheel() {
        this.quality = false;
    }

    public void goodWheel() {
        this.quality = true;
    }
}
