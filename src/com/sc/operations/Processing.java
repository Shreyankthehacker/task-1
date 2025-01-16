package com.sc.operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Processing {

    public static void processOperations(String operationsFile,Map<Character, Integer> charToValue,Map<Integer, Character> valueToChar) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(operationsFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String operation = line.trim();
                String[] operand1 = br.readLine().split("\\s+");
                String[] operand2 = br.readLine().split("\\s+");

                int base1 = Integer.parseInt(operand1[0]);
                String num1 = operand1[1];
                int base2 = Integer.parseInt(operand2[0]);
                String num2 = operand2[1];

                if ("add".equalsIgnoreCase(operation)) {
                    String result = Operations.add(base1, num1, base2, num2,charToValue,valueToChar);
                    System.out.println("Result (add): " + result);
                } else if ("subtract".equalsIgnoreCase(operation)) {
                    String result = Operations.subtract(base1, num1, base2, num2,charToValue,valueToChar);
                    System.out.println("Result (subtract): " + result);
                }
            }
        }
    }}
