package com.lambdaschool;

public class Dollar extends Coin {
//    private final double worth = 1.00;
    private int count = 0;

    public Dollar() {
        super(1.00);
        this.count++;
    }

    public Dollar(int count) {
        super(1.00);
        this.count += count;
    }

    @Override
    public double getCount() {
        return count * getValue();
    }

    @Override
    public String toString() {
        return ("$" + count);
    }
}
