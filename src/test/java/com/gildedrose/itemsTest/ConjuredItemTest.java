package com.gildedrose.itemsTest;

import com.gildedrose.GildedRose;
import com.gildedrose.items.ConjuredItem;
import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredItemTest {

    static final String CONJURED_ITEM_NAME= "Conjured";
    static final int SELLIN_PASSED = 0;
    static final int SELLIN_NOT_PASSED = 3;
    static final int CONJURED_ITEM_QUALITY = 20;

    static final int CONJURED_ITEM_QUALITY_DATE_PASSED_EXPECTED = 16;
    static final int CONJURED_ITEM_QUALITY_DATE_NOT_PASSED_EXPECTED = 18;
    @Test
    void checkConjuredItemUpdateDateHasNotPassedQualityTest() {
        Item[] items = new Item[] { new Item(CONJURED_ITEM_NAME, SELLIN_NOT_PASSED, CONJURED_ITEM_QUALITY) };
        GildedRose app = new GildedRose(items);
        ConjuredItem conjuredItem = new ConjuredItem(getFirstItem(app));
        conjuredItem.update();
        assertEquals(CONJURED_ITEM_QUALITY_DATE_NOT_PASSED_EXPECTED,getFirstItemQuality(app));
    }

    @Test
    void checkConjuredItemUpdateDateHasPassedQualityTest() {
        Item[] items = new Item[] { new Item(CONJURED_ITEM_NAME, SELLIN_PASSED, CONJURED_ITEM_QUALITY) };
        GildedRose app = new GildedRose(items);
        ConjuredItem conjuredItem = new ConjuredItem(getFirstItem(app));
        conjuredItem.update();
        assertEquals(CONJURED_ITEM_QUALITY_DATE_PASSED_EXPECTED,getFirstItemQuality(app));
    }

    int getFirstItemQuality(GildedRose app){
        return app.items[0].quality;
    }
    Item getFirstItem(GildedRose app){
        return app.items[0];
    }
}
