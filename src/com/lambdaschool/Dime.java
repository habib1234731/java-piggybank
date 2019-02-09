package com.lambdaschool;

public class Dime extends Coin{
    private int count = 0;

    public Dime() {
        super(0.10);
        this.count++;
    }

    public Dime(int count) {
        super(0.10);
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
