package com.hw;

public class IntegerFunctions {
    private int intValue1 = 13;
    private int intValue2 = 7;

    public void intAddition() {
        int result = intValue1 + intValue2;
        System.out.println("intAddition is " + result);
    }

    public void intSubtraction() {
        int result = intValue1 - intValue2;
        System.out.println("intSubtraction is " + result);
    }

    public void intMultiplication() {
        int result = intValue1 * intValue2;
        System.out.println("intMultiplication is " + result);
    }

    public void intDivision() {
        int result = intValue1 / intValue2;
        System.out.println("intDivision is " + result);
    }

    public void intModuloDivision() {
        int result = intValue1 % intValue2;
        System.out.println("intModuloDivision is " + result);
    }
}
