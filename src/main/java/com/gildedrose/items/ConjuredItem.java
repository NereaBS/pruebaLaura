package com.gildedrose.items;

import com.gildedrose.IGildedRoseItem;
import com.gildedrose.control.Quality;
import com.gildedrose.control.SellIn;
import com.gildedrose.utils.Utilities;

public class ConjuredItem implements IGildedRoseItem {
    private final Item item;
    public static final String CONJURED_ITEM_NAME = "Conjured";
    public ConjuredItem(Item item) {
        this.item = item;
    }

    private static final Utilities UTILITIES = new Utilities();

    @Override
    public void update() {
        updateQuality();
        updateSellin();
    }

    public void updateQuality() {
        Quality quality = new Quality(item.quality);
        int decrement_value = 2;
        if (UTILITIES.checkSellInGreaterThanCero(item)){
            decrement_value+=2;
        }
        quality.decrease(decrement_value);
        item.quality = quality.getValue();
    }
    public void updateSellin () {
        SellIn sellIn = new SellIn();
        sellIn.decreaseInOne();
        item.sellIn = sellIn.getValue();
    }
}
