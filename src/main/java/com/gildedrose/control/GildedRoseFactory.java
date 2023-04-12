package com.gildedrose.control;

import com.gildedrose.IGildedRoseItem;
import com.gildedrose.items.*;

public class GildedRoseFactory {
    public static IGildedRoseItem getGildedRoseItem(Item item){
        if(itemIsSulfuras(item.name)) {
            return new SulfurasItem(item);
        }
        if(itemIsAgedBrie(item.name)) {
            return new AgedBrieItem(item);
        }
        if(itemIsBackstage(item.name)) {
            return new BackStageItem(item);
        }
        if(itemIsConjured(item.name)) {
            return new ConjuredItem(item);
        }
        return new NormalItem(item);
    }
    private static boolean itemIsBackstage(String name) {
        final String BACKSTAGE = "Backstage";
        return name.contains(BACKSTAGE);
    }
    private static boolean itemIsAgedBrie(String name) {
        final String AGED_BRIE = "Aged Brie";
        return name.contains(AGED_BRIE);
    }
    private static boolean itemIsSulfuras(String name) {
        final String SULFURAS = "Sulfuras";
        return name.contains(SULFURAS);
    }
    private static boolean itemIsConjured(String name) {
        final String CONJURED = "Conjured";
        return name.contains(CONJURED);
    }
}
