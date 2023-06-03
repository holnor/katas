package hu.holnor.katas;

import java.util.HashMap;
import java.util.Map;

public class Engine {
    /*
     * Roman numbers are made up from the following letters: I, V, X, L, C, D, M.
     * Create a converter, that can  turn arabic numbers into roman and vice versa
     * For example 3798 -> MMMDCCXCVIII
     *             CMXCVII -> 997
     *
     * There is no need to be able to convert numbers larger than about 3000.
     *
     * */


    public String numberToNumeral(int number) {
        String[][] characterTable = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
        };

        StringBuilder sb = new StringBuilder();
        int digits = getDigitCount(number);

        for (int i = 0; i < digits; i++) {
            int index = number % 10;
            sb.insert(0, characterTable[i][index]);
            number /= 10;
        }
        return sb.toString();
    }

    public int getDigitCount(int number) {
        int digits = 0;
        while (number != 0) {
            number /= 10;
            digits++;
        }
        return digits;
    }

    public int romanToArabic(String romanNumber) {

        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = romanNumerals.get(romanNumber.charAt(romanNumber.length() -1));

        for (int i = 0; i < romanNumber.length() - 1; i++) {
            int actualValue = romanNumerals.get(romanNumber.charAt(i));
            int nextValue = romanNumerals.get(romanNumber.charAt(i + 1));
            if (actualValue >= nextValue){ //MCMXCIII --> 1993
                result += actualValue;
            } else {
                result -= actualValue;
            }
        }
        return result;
    }
}