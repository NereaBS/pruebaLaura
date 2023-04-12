package com.gildedrose.utils;

import com.gildedrose.items.Item;

public class Utilities {

    static final int CONSTANT_CERO = 0;
    static final int QUALITY_FIFTY = 50;
    static final int SELLIN_TEN = 10;
    static final int SELLIN_FIVE = 5;

    public boolean checkSellInGreaterThanCero(Item item) {
        return item.sellIn <= CONSTANT_CERO;
    }
    public boolean checkQualityInRange50(Item item) {
        return item.quality + 2 <= QUALITY_FIFTY || item.quality + 1 <= QUALITY_FIFTY;
    }
    public boolean checkSellInGreaterThanFive(Item item) {
        return item.sellIn > SELLIN_FIVE;
    }
    public boolean checkSellInGreaterThanTen(Item item) {
        return item.sellIn > SELLIN_TEN;
    }

}
