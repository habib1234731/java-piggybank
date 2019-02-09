package com.lambdaschool;

public class Nickle extends Coin{
    private int count = 0;

    public Nickle() {
        super(0.05);
        this.count++;
    }

    public Nickle(int count) {
        super(0.05);
        this.count += count;
    }

    @Override
    public double getCount() {
        return count * getValue();
    }

    @Override
    public String toString() {
        return (count + "Nickle");
    }
}
