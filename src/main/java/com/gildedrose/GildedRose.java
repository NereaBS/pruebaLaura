package com.gildedrose;

import com.gildedrose.control.GildedRoseFactory;
import com.gildedrose.items.Item;

import java.util.Arrays;

public class GildedRose {
    public Item[] items;
    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateItem() {
        Arrays.stream(items).map(GildedRoseFactory::getGildedRoseItem).forEach(IGildedRoseItem::update);
    }
}
