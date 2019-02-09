package com.lambdaschool;

public class Quarter extends Coin{
    private int count = 0;

    public Quarter() {
        super(0.25);
        this.count++;
    }

    public Quarter(int count) {
        super(0.25);
        this.count += count;
    }

    @Override
    public double getCount() {
        return count * getValue();
    }

    @Override
    public String toString() {
        return (count + "Quarter");
    }
}
