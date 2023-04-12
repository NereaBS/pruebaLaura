package com.gildedrose.control;

public class SellIn {

    private int value;
    public void decreaseInOne() {
        final int DECREMENT_VALUE = 1;
        value -= DECREMENT_VALUE;
    }
    public int getValue() {
        return value;
    }
}
