package com.hw;

import java.util.Arrays;

public class MyArrayMinMax<T extends Comparable<T>> {

    public T[] myArray;

    public MyArrayMinMax(T[] array) {
        this.myArray = array;
    }

    public T getHighest() {
        int highest = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i].compareTo(myArray[highest]) > 0)
                highest = i;
        }
        return myArray[highest];
    }

    public T getLowest() {
        int lowest = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i].compareTo(myArray[lowest]) < 0)
                lowest = i;
        }
        return myArray[lowest];
    }

    @Override
    public String toString() {
        return "MyArrayMinMax is " +
                "myArray = " + Arrays.toString(myArray);
    }
}
