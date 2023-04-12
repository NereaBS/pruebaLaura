package com.gildedrose.control;

public class Quality {
    private int value;
    public static final int QUALITY_MAX_LIMIT = 50;
    public static final int QUALITY_MIN_LIMIT = 0;

    public Quality(Integer quality) {
        value = quality;
    }

    public void increase(int incrementValue){
        if (value + incrementValue > QUALITY_MAX_LIMIT) {
            value = QUALITY_MAX_LIMIT;
            return;
        }
        value += incrementValue;
    }
    public void decrease(int decrementValue){
        if (value - decrementValue < QUALITY_MIN_LIMIT) {
            value = QUALITY_MIN_LIMIT;
            return;
        }
        value -= decrementValue;
    }

    public int getValue() {
        return value;
    }

    public void setMinValue() {
        this.value = QUALITY_MIN_LIMIT;
    }
}
