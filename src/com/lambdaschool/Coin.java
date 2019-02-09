package com.lambdaschool;

public abstract class Coin {
    private double value;

    public Coin(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public abstract double getCount();
}
