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
        assertEquals("XXXIV", engine.arabicToRoman(34));
        assertEquals("XLIX", engine.arabicToRoman(49));
        assertEquals("XCIV", engine.arabicToRoman(94));
        assertEquals("CMXCIV", engine.arabicToRoman(994));
        assertEquals("MMCDXLIV", engine.arabicToRoman(2444));
    }

    @Test
    void test_romanToArabic_compile(){

    }
}