package com.gildedrose.itemsTest;

import com.gildedrose.GildedRose;
import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTest {

    static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    static final int SELLIN_DEFAULT = 5;
    static final int SULFURAS_QUALITY = 80;

    @Test
    void checkSulfurasStillEqualsTest() {
        Item[] items = new Item[] { new Item(SULFURAS, SELLIN_DEFAULT, SULFURAS_QUALITY) };
        GildedRose app = new GildedRose(items);
        app.updateItem();
        assertEquals(SELLIN_DEFAULT,app.items[0].sellIn);
        assertEquals(SULFURAS_QUALITY,app.items[0].quality);
    }
}
