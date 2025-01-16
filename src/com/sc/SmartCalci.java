package com.sc;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.sc.operations.Processing;
import com.sc.symbols.SymbolsInit;

public class SmartCalci {
    private static  Map<Character, Integer> charToValue = new HashMap<>();
    private static  Map<Integer, Character> valueToChar = new HashMap<>();

    public static void main(String[] args) throws IOException {
        
    	SymbolsInit.initializeSymbols("file1.txt");
    	charToValue = SymbolsInit.getChartovalue();
    	valueToChar = SymbolsInit.getValuetochar();
    	Processing.processOperations("file2.txt",charToValue,valueToChar);
    }

   

    }



  

