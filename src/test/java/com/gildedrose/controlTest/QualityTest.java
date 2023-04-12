package com.gildedrose.controlTest;

import com.gildedrose.control.Quality;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QualityTest {

    @Test
    void increaseQualityTest() {
        final int QUALITY_AMOUNT_ALLOWED_TO_BE_INCREASED = 30;
        Quality quality = new Quality(QUALITY_AMOUNT_ALLOWED_TO_BE_INCREASED);
        int INCREMENT_VALUE = 1;
        quality.increase(INCREMENT_VALUE);

        final int EXPECTED_INCREASED_QUALITY = 31;
        assertEquals(EXPECTED_INCREASED_QUALITY,quality.getValue());
    }
    @Test
    void increaseQualityMoreThanLimitReturnLimitTest() {
        final int QUALITY_AMOUNT_NOT_ALLOWED_TO_BE_INCREASED = 50;
        Quality quality = new Quality(QUALITY_AMOUNT_NOT_ALLOWED_TO_BE_INCREASED);
        int incrementValue = 1;
        quality.increase(incrementValue);

        final int EXPECTED_INCREASED_QUALITY = Quality.QUALITY_MAX_LIMIT;
        assertEquals(EXPECTED_INCREASED_QUALITY,quality.getValue());
    }
    @Test
    void decreaseQualityTest() {
        final int QUALITY_AMOUNT_ALLOWED_TO_BE_DECREASED = 1;
        Quality quality = new Quality(QUALITY_AMOUNT_ALLOWED_TO_BE_DECREASED);
        int decreaseValue = 1;
        quality.decrease(decreaseValue);

        final int EXPECTED_DECREASED_QUALITY = Quality.QUALITY_MIN_LIMIT;
        assertEquals(EXPECTED_DECREASED_QUALITY,quality.getValue());
    }

}
