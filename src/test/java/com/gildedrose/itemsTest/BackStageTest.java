package com.gildedrose.itemsTest;

import com.gildedrose.GildedRose;
import com.gildedrose.items.Item;
import com.gildedrose.utils.Utilities;
import com.gildedrose.items.BackStageItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BackStageTest {

    static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    static final int BACKSTAGE_QUALITY = 20;
    static final int SELLIN_PASSED = 0;
    static final int SELLIN_GREATER_THAN_TEN = 11;
    static final int SELLIN_LESS_THAN_FIVE = 3;
    static final int BACKSTAGE_DATE_PASSED_QUALITY_EXPECTED = 0;
    static final int BACKSTAGE_DATE_NOT_PASSED_QUALITY_EXPECTED = 21;
    static final int BACKSTAGE_QUALITY_EXPECTED = 23;
    static final Utilities UTILITIES = new Utilities();


    @Test
    void checkBackStageQualityDateHasPassedTest() {
        Item[] items = new Item[] { new Item(BACKSTAGE, SELLIN_PASSED, BACKSTAGE_QUALITY) };
        GildedRose app = new GildedRose(items);
        app.updateItem();
        assertEquals(BACKSTAGE_DATE_PASSED_QUALITY_EXPECTED,getFirstItemQuality(app));
    }
    @Test
    void checkBackStageQualityDateHasNotPassedTest() {
        Item[] items = new Item[] { new Item(BACKSTAGE, SELLIN_GREATER_THAN_TEN, BACKSTAGE_QUALITY) };
        GildedRose app = new GildedRose(items);
        app.updateItem();
        assertEquals(BACKSTAGE_DATE_NOT_PASSED_QUALITY_EXPECTED,getFirstItemQuality(app));
    }
    @Test
    void checkBackstageSellInGreaterThanTenTest() {
        Item[] items = new Item[] { new Item(BACKSTAGE, SELLIN_GREATER_THAN_TEN, BACKSTAGE_QUALITY) };
        GildedRose app = new GildedRose(items);
        assertTrue(UTILITIES.checkSellInGreaterThanTen(getFirstItem(app)));
    }
    @Test
    void checkBackstageSellInGreaterThanFiveTest() {
        Item[] items = new Item[] { new Item(BACKSTAGE, SELLIN_LESS_THAN_FIVE, BACKSTAGE_QUALITY) };
        GildedRose app = new GildedRose(items);
        assertFalse(UTILITIES.checkSellInGreaterThanFive(getFirstItem(app)));
    }
    @Test
    void checkBackStageUpdateQualityTest() {
        Item[] items = new Item[] { new Item(BACKSTAGE, SELLIN_LESS_THAN_FIVE, BACKSTAGE_QUALITY) };
        GildedRose app = new GildedRose(items);
        BackStageItem backStageItem = new BackStageItem(getFirstItem(app));
        backStageItem.update();
        assertEquals(BACKSTAGE_QUALITY_EXPECTED,getFirstItemQuality(app));
    }

    int getFirstItemQuality(GildedRose app){
        return app.items[0].quality;
    }

    Item getFirstItem(GildedRose app){
        return app.items[0];
    }


}
