package hu.holnor.katas;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class EngineTest {
    private final Engine engine = new Engine();


    @Test
    void test_getDigitCount() {
        assertEquals(3, engine.getDigitCount(321));
        assertEquals(5, engine.getDigitCount(12345));
    }

    @Test
    void test_numberToNumeral() {
        assertEquals("XXXIV", engine.numberToNumeral(34));
        assertEquals("XLIX", engine.numberToNumeral(49));
        assertEquals("XCIV", engine.numberToNumeral(94));
        assertEquals("CMXCIV", engine.numberToNumeral(994));
        assertEquals("MMCDXLIV", engine.numberToNumeral(2444));

    }
}
