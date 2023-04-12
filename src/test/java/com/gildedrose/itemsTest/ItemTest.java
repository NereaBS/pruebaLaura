package com.gildedrose.itemsTest;

import com.gildedrose.GildedRose;
import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
    static final int NEGATIVE_QUALITY = -4;
    static final int GREATER_THAN_50_QUALITY = 51;
    static final int QUALITY_DEFAULT = 20;
    static final int SELLIN_PASSED = 0;
    static final int SELLIN_DEFAULT = 5;
    static final String ITEM_DEFAULT = "Item default";
    static final int ITEM_DEFAULT_DATE_PASSED_QUALITY_EXPECTED = 18;
    static final int ITEM_DEFAULT_NOT_PASSED_QUALITY_EXPECTED = 19;

    @Test
    void checkQualityDateHasPassedTest() {
        //Arrange
        Item[] items = new Item[] { new Item(ITEM_DEFAULT, SELLIN_PASSED, QUALITY_DEFAULT) };
        GildedRose app = new GildedRose(items);
        //Act
        app.updateItem();
        //Assert
        assertEquals(ITEM_DEFAULT_DATE_PASSED_QUALITY_EXPECTED,app.items[0].quality);
    }
    @Test
    void checkQualityDateHasNotPassedTest() {
        //Arrange
        Item[] items = new Item[] { new Item(ITEM_DEFAULT, SELLIN_DEFAULT, QUALITY_DEFAULT) };
        GildedRose app = new GildedRose(items);
        //Act
        app.updateItem();
        //Assert
        assertEquals(ITEM_DEFAULT_NOT_PASSED_QUALITY_EXPECTED,app.items[0].quality);
    }

}
