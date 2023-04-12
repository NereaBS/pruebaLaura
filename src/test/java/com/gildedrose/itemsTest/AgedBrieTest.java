package com.gildedrose.itemsTest;

import com.gildedrose.GildedRose;
import com.gildedrose.items.Item;
import com.gildedrose.utils.Utilities;
import com.gildedrose.items.AgedBrieItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AgedBrieTest {

    static final int AGED_BRIE_QUALITY_DEFAULT = 20;
    static final int AGED_BRIE_QUALITY_CLOSE_50 = 49;
    static final int AGED_BRIE_QUALITY_50 = 50;
    static final int SELLIN_PASSED = 0;
    static final int SELLIN_DEFAULT = 5;
    static final String AGED_BRIE = "Aged Brie";
    static final Utilities UTILITIES = new Utilities();
    @Test
    void checkAgedBrieQualityDateHasPassedTest() {
        Item[] items = new Item[] { new Item(AGED_BRIE, SELLIN_PASSED, AGED_BRIE_QUALITY_DEFAULT) };
        GildedRose app = new GildedRose(items);
        app.updateItem();
        final int AGED_BRIE_DATE_PASSED_QUALITY_EXPECTED = 22;
        assertEquals(AGED_BRIE_DATE_PASSED_QUALITY_EXPECTED,getFirstItemQuality(app));
    }
    @Test
    void checkAgedBrieQualityDateHasNotPassedTest() {
        Item[] items = new Item[] { new Item(AGED_BRIE, SELLIN_DEFAULT, AGED_BRIE_QUALITY_DEFAULT) };
        GildedRose app = new GildedRose(items);
        app.updateItem();
        final int AGED_BRIE_DATE_NOT_PASSED_QUALITY_EXPECTED = 21;
        assertEquals(AGED_BRIE_DATE_NOT_PASSED_QUALITY_EXPECTED,getFirstItemQuality(app));
    }
    @Test
    void checkItemUpdateQualityInRange50Test() {
        Item[] items = new Item[] { new Item(AGED_BRIE, SELLIN_DEFAULT, AGED_BRIE_QUALITY_50)};
        GildedRose app = new GildedRose(items);
        app.updateItem();
        assertEquals(AGED_BRIE_QUALITY_50,getFirstItemQuality(app));
    }
    @Test
    void checkAgedBrieQualityInRange50Test() {
        Item[] items = new Item[] { new Item(AGED_BRIE, SELLIN_DEFAULT, AGED_BRIE_QUALITY_CLOSE_50) };
        GildedRose app = new GildedRose(items);
        assertTrue(UTILITIES.checkQualityInRange50(getFirstItem(app)));
    }
    @Test
    void checkAgedBrieQualityNotInRange50Test() {
        Item[] items = new Item[] { new Item(AGED_BRIE, SELLIN_DEFAULT, AGED_BRIE_QUALITY_50) };
        GildedRose app = new GildedRose(items);
        assertFalse(UTILITIES.checkQualityInRange50(getFirstItem(app)));
    }
    @Test
    void checkAgedBrieUpdateQualityTest() {
        Item[] items = new Item[] { new Item(AGED_BRIE, SELLIN_PASSED, AGED_BRIE_QUALITY_DEFAULT) };
        GildedRose app = new GildedRose(items);
        AgedBrieItem agedBrieItem = new AgedBrieItem(getFirstItem(app));
        agedBrieItem.update();
        final int AGED_BRIE_DATE_PASSED_QUALITY_EXPECTED = 22;
        assertEquals(AGED_BRIE_DATE_PASSED_QUALITY_EXPECTED,getFirstItemQuality(app));
    }
    Item getFirstItem(GildedRose app){
        return app.items[0];
    }

    int getFirstItemQuality(GildedRose app){
        return app.items[0].quality;
    }
}
