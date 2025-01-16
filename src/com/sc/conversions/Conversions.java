package com.sc.conversions;

import java.util.HashMap;
import java.util.Map;

public class Conversions {
  
    public static int toDecimal(String number, int base,Map<Character, Integer> charToValue) {
        int decimal = 0;
        for (char ch : number.toCharArray()) {
            decimal = decimal * base + charToValue.get(ch);
        }
        return decimal;
    }

    public static String fromDecimal(int number, int base,Map<Integer, Character> valueToChar) {
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            result.append(valueToChar.get(number % base));
            number /= base;
        }
        return result.reverse().toString();
    }
	
	
}
