package com.sc.operations;

import java.util.Map;

import com.sc.conversions.Conversions;

public class Operations {
    public static String add(int base1, String num1, int base2, String num2,Map<Character, Integer> charToValue,Map<Integer, Character> valueToChar) {
        int decimal1 = Conversions.toDecimal(num1, base1,charToValue);
        int decimal2 =  Conversions.toDecimal(num2, base2,charToValue);
        int sum = decimal1 + decimal2;
        return Conversions.fromDecimal(sum, Math.max(base1, base2), valueToChar);
    }

    public static String subtract(int base1, String num1, int base2, String num2,Map<Character, Integer> charToValue,Map<Integer, Character> valueToChar) {
        int decimal1 = Conversions.toDecimal(num1, base1,charToValue);
        int decimal2 = Conversions.toDecimal(num2, base2,charToValue);
        int diff = decimal1 - decimal2;
        return Conversions.fromDecimal(diff, Math.max(base1, base2),valueToChar);
    }
}
