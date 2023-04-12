package com.gildedrose.items;

import com.gildedrose.IGildedRoseItem;
import com.gildedrose.control.Quality;
import com.gildedrose.control.SellIn;
import com.gildedrose.utils.Utilities;

public class BackStageItem implements IGildedRoseItem {
    private final Item item;

    public static final String BACKSTAGE_ITEM_NAME = "Backstage";

    public BackStageItem(Item item) {
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
        if(!UTILITIES.checkSellInGreaterThanFive(item)) {
            incrementValue++;
        }
        if(!UTILITIES.checkSellInGreaterThanTen(item)){
            incrementValue++;
        }
        quality.increase(incrementValue);
        if(UTILITIES.checkSellInGreaterThanCero(item)) {
            quality.setMinValue();
        }
        item.quality = quality.getValue();
    }
    public void updateSellin () {
        SellIn sellIn = new SellIn();
        sellIn.decreaseInOne();
        item.sellIn = sellIn.getValue();
    }
}
