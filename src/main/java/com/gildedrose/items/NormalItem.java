package com.gildedrose.items;

import com.gildedrose.IGildedRoseItem;
import com.gildedrose.control.Quality;
import com.gildedrose.control.SellIn;
import com.gildedrose.utils.Utilities;

public class NormalItem implements IGildedRoseItem {
    private final Item item;
    public static final String NORMAL_ITEM_NAME = "Normal item";
    public NormalItem(Item item) {
        this.item = item;
    }
    private static final Utilities UTILITIES = new Utilities();
    public void update() {
        updateQuality();
        updateSellin();
    }

    public void updateQuality() {
        Quality quality = new Quality(item.quality);
        int decrease_value = 1;
        if (UTILITIES.checkSellInGreaterThanCero(item)){
            decrease_value++;
        }
        quality.decrease(decrease_value);
        item.quality = quality.getValue();
    }
    public void updateSellin () {
        SellIn sellIn = new SellIn();
        sellIn.decreaseInOne();
        item.sellIn = sellIn.getValue();
    }
}
