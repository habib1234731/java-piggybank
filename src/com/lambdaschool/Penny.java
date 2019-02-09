package com.lambdaschool;

public class Penny extends Coin{
    private int count = 0;

    public Penny() {
        super(0.01);
        this.count++;
    }

    public Penny(int count) {
        super(0.01);
        this.count += count;
    }

    @Override
    public double getCount() {
        return count * getValue();
    }

    @Override
    public String toString() {
        return (count + " Dime");
    }
}
