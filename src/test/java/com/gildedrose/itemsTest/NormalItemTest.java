package com.gildedrose.itemsTest;

import com.gildedrose.GildedRose;
import com.gildedrose.items.Item;
import com.gildedrose.items.NormalItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalItemTest
{
    static final String NORMAL_ITEM_NAME= "Normal item";
    static final int SELLIN_PASSED = 0;
    static final int SELLIN_NOT_PASSED = 3;
    static final int NORMAL_ITEM_QUALITY = 20;

    static final int NORMAL_ITEM_QUALITY_DATE_PASSED_EXPECTED = 18;
    static final int NORMAL_ITEM_QUALITY_DATE_NOT_PASSED_EXPECTED = 19;
    @Test
    void checkBackStageUpdateDateHasNotPassedQualityTest() {
        Item[] items = new Item[] { new Item(NORMAL_ITEM_NAME, SELLIN_NOT_PASSED, NORMAL_ITEM_QUALITY) };
        GildedRose app = new GildedRose(items);
        NormalItem normalItem = new NormalItem(getFirstItem(app));
        normalItem.update();
        assertEquals(NORMAL_ITEM_QUALITY_DATE_NOT_PASSED_EXPECTED,getFirstItemQuality(app));
    }

    @Test
    void checkBackStageUpdateDateHasPassedQualityTest() {
        Item[] items = new Item[] { new Item(NORMAL_ITEM_NAME, SELLIN_PASSED, NORMAL_ITEM_QUALITY) };
        GildedRose app = new GildedRose(items);
        NormalItem normalItem = new NormalItem(getFirstItem(app));
        normalItem.update();
        assertEquals(NORMAL_ITEM_QUALITY_DATE_PASSED_EXPECTED,getFirstItemQuality(app));
    }

    int getFirstItemQuality(GildedRose app){
        return app.items[0].quality;
    }
    Item getFirstItem(GildedRose app){
        return app.items[0];
    }
}
