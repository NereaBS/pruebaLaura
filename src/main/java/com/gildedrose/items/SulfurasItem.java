package com.gildedrose.items;

import com.gildedrose.IGildedRoseItem;

public class SulfurasItem implements IGildedRoseItem {
    private final Item item;
    public static final String SULFURAS_ITEM_NAME = "Sulfuras";
    public SulfurasItem(Item item) {
        this.item = item;
    }
    public void update() {
        final int SULFURAS_CONSTANT_QUALITY = 80;
        item.quality = SULFURAS_CONSTANT_QUALITY;
    }
}
