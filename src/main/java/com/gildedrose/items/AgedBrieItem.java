package com.gildedrose.items;

import com.gildedrose.IGildedRoseItem;
import com.gildedrose.control.Quality;
import com.gildedrose.control.SellIn;
import com.gildedrose.utils.Utilities;

public class AgedBrieItem implements IGildedRoseItem {
    private final Item item;
    public static final String AGED_BRIE_ITEM_NAME = "Aged Brie";
    public AgedBrieItem(Item item) {
        this.item = item;
    }
    private static final Utilities UTILITIES = new Utilities();
    public void update() {
        updateQuality();
        updateSellin();
    }
    public void updateQuality() {
        int incrementValue = 1;
        Quality quality = new Quality(item.quality);
        if(UTILITIES.checkSellInGreaterThanCero(item)) {
            incrementValue++;
        }
        quality.increase(incrementValue);
        item.quality = quality.getValue();
    }
    public void updateSellin () {
        SellIn sellIn = new SellIn();
        sellIn.decreaseInOne();
        item.sellIn = sellIn.getValue();
    }
}
