package com.lambdaschool;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PiggyBank {
//    private ArrayList<Coin<? implements Money>> list = new ArrayList<>();
    private ArrayList<Coin> list = new ArrayList<>();

    public <E extends Coin> boolean add (E coin) {
        list.add(coin);
        return true;
    }

    public void printContent () {
        for (Coin c : list) {
            System.out.println(c);
        }
    }

    public void printValue () {
        double total = 0.00;
        for (Coin c : list) {
            total += c.getCount();
        }
        System.out.printf("The piggy bank holds $%.2f",total);
    }
}
