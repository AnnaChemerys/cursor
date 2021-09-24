package com.hw;

public class ByteFunctions {
    byte byteValue1 = 1;
    byte byteValue2 = 4;

    public void byteAddition() {
        byte result = (byte) (byteValue1 + byteValue2);
        System.out.println("byteAddition is " + result);
    }

    public void byteSubtraction() {
        byte result = (byte) (byteValue1 - byteValue2);
        System.out.println("byteSubtraction is " + result);
    }

    public void byteMultiplication() {
        byte result = (byte) (byteValue1 * byteValue2);
        System.out.println("byteMultiplication is " + result);
    }

    public void byteDivision() {
        byte result = (byte) (byteValue1 / byteValue2);
        System.out.println("byteDivision is " + result);
    }

    public void byteModuloDivision() {
        byte result = (byte) (byteValue1 % byteValue2);
        System.out.println("byteModuloDivision is " + result);
    }
}
