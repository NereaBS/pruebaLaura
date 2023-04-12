package com.gildedrose.controlTest;

import com.gildedrose.control.GildedRoseFactory;
import com.gildedrose.IGildedRoseItem;
import com.gildedrose.items.Item;
import com.gildedrose.items.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GildedRoseFactoryTest {

    @Test
    void getGildedRoseItemReturnAgedBrieItemTest() {
        Item item = new Item(AgedBrieItem.AGED_BRIE_ITEM_NAME,3,20);
        IGildedRoseItem iGildedRoseItem = GildedRoseFactory.getGildedRoseItem(item);

        assertInstanceOf(AgedBrieItem.class,iGildedRoseItem);

    }
    @Test
    void getGildedRoseItemReturnBackStageItemTest() {
        Item item = new Item(BackStageItem.BACKSTAGE_ITEM_NAME,3,20);
        IGildedRoseItem iGildedRoseItem = GildedRoseFactory.getGildedRoseItem(item);

        assertInstanceOf(BackStageItem.class,iGildedRoseItem);
    }
    @Test
    void getGildedRoseItemReturnSulfurasItemTest() {
        Item item = new Item(SulfurasItem.SULFURAS_ITEM_NAME,3,20);
        IGildedRoseItem iGildedRoseItem = GildedRoseFactory.getGildedRoseItem(item);

        assertInstanceOf(SulfurasItem.class,iGildedRoseItem);
    }
    @Test
    void getGildedRoseItemReturnNormalItemTest() {
        Item item = new Item(NormalItem.NORMAL_ITEM_NAME,3,20);
        IGildedRoseItem iGildedRoseItem = GildedRoseFactory.getGildedRoseItem(item);

        assertInstanceOf(NormalItem.class,iGildedRoseItem);
    }
    @Test
    void getGildedRoseItemReturnConjuredItemTest() {
        Item item = new Item(ConjuredItem.CONJURED_ITEM_NAME,3,20);
        IGildedRoseItem iGildedRoseItem = GildedRoseFactory.getGildedRoseItem(item);

        assertInstanceOf(ConjuredItem.class,iGildedRoseItem);
    }
    @Test
    void isAgedBrieNameTest(){
        final String NAME_EXPECTED = "Aged Brie";
        assertEquals(NAME_EXPECTED,AgedBrieItem.AGED_BRIE_ITEM_NAME);
    }
    @Test
    void isBackstageNameTest(){
        final String NAME_EXPECTED = "Backstage";
        assertEquals(NAME_EXPECTED,BackStageItem.BACKSTAGE_ITEM_NAME);
    }
    @Test
    void isSulfurasNameTest(){
        final String NAME_EXPECTED = "Sulfuras";
        assertEquals(NAME_EXPECTED,SulfurasItem.SULFURAS_ITEM_NAME);
    }
    @Test
    void isConjuredNameTest(){
        final String NAME_EXPECTED = "Conjured";
        assertEquals(NAME_EXPECTED,ConjuredItem.CONJURED_ITEM_NAME);
    }
}
