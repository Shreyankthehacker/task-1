package com.sc.symbols;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SymbolsInit {
	 private static final Map<Character, Integer> charToValue = new HashMap<>();
	    private static final Map<Integer, Character> valueToChar = new HashMap<>();
	    
	    public static  void initializeSymbols(String symbolsFile) throws IOException {
	        try (BufferedReader br = new BufferedReader(new FileReader(symbolsFile))) {
	            String[] symbols = br.readLine().split("\\s+");
	            for (int i = 0; i < symbols.length; i++) {
	                charToValue.put(symbols[i].charAt(0), i);
	                valueToChar.put(i, symbols[i].charAt(0));
	            }
	        }
	    }

		public static Map<Character, Integer> getChartovalue() {
			return charToValue;
		}

		public static Map<Integer, Character> getValuetochar() {
			return valueToChar;
		}
	    
	    
}
