package com.hw;

public class Main {

    public static void main(String[] args) {
        IntegerFunctions integerFunctions = new IntegerFunctions();
        integerFunctions.intAddition();
        integerFunctions.intSubtraction();
        integerFunctions.intMultiplication();
        integerFunctions.intDivision();
        integerFunctions.intModuloDivision();

        ByteFunctions byteFunctions = new ByteFunctions();
        byteFunctions.byteAddition();
        byteFunctions.byteSubtraction();
        byteFunctions.byteMultiplication();
        byteFunctions.byteDivision();
        byteFunctions.byteModuloDivision();

        ShortFunctions shortFunctions = new ShortFunctions();
        shortFunctions.shortAddition();
        shortFunctions.shortSubtraction();
        shortFunctions.shortMultiplication();
        shortFunctions.shortDivision();
        shortFunctions.shortModuloDivision();

        LongFunctions longFunctions = new LongFunctions();
        longFunctions.longAddition();
        longFunctions.longSubtraction();
        longFunctions.longMultiplication();
        longFunctions.longDivision();
        longFunctions.longModuloDivision();

        FloatFunctions floatFunctions = new FloatFunctions();
        floatFunctions.floatAddition();
        floatFunctions.floatSubtraction();
        floatFunctions.floatMultiplication();
        floatFunctions.floatDivision();
        floatFunctions.floatModuloDivision();

        DoubleFunctions doubleFunctions = new DoubleFunctions();
        doubleFunctions.doubleAddition();
        doubleFunctions.doubleSubtraction();
        doubleFunctions.doubleMultiplication();
        doubleFunctions.doubleDivision();
        doubleFunctions.doubleModuloDivision();
    }
}
