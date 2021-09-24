package com.hw;

public class ShortFunctions {
    short shortValue1 = 15;
    short shortValue2 = 6;

    public void shortAddition() {
        short result = (short) (shortValue1 + shortValue2);
        System.out.println("shortAddition is " + result);
    }

    public void shortSubtraction() {
        short result = (short) (shortValue1 - shortValue2);
        System.out.println("shortSubtraction is " + result);
    }

    public void shortMultiplication() {
        short result = (short) (shortValue1 * shortValue2);
        System.out.println("shortMultiplication is " + result);
    }

    public void shortDivision() {
        short result = (short) (shortValue1 / shortValue2);
        System.out.println("shortDivision is " + result);
    }

    public void shortModuloDivision() {
        short result = (short) (shortValue1 % shortValue2);
        System.out.println("shortModuloDivision is " + result);
    }
}
