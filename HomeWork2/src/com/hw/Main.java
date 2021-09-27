package com.hw;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        reverseArray();

        sumOnlyPositive();

        averageOfArray();

        withoutDouplicates();
    }

    private static void reverseArray() {
        Integer[] reverseArrayOfInts = {2, 3, 1, 7, 11};

        Arrays.sort(reverseArrayOfInts, Collections.reverseOrder());

        System.out.println("Array after sorting in descending order - " + Arrays.toString(reverseArrayOfInts));
    }

    private static void sumOnlyPositive() {
        int[] positiveNegativeInts = {6, -8, 13, 15, -147, 19, 164, -74, -2, -7, 10, 69, 666};
        int sumPositive = 0;

        for (int i = 0; i < positiveNegativeInts.length; i++) {
            if (positiveNegativeInts[i] > 0) {
                sumPositive += positiveNegativeInts[i];
            }
        }

        System.out.println("The sum of only positive numbers in the array is " + sumPositive);
    }

    private static void averageOfArray() {
        int[] averageInt = {4, 8, 13, -7, 43, 115, 6};
        int average;
        int sum = 0;

        for (int item : averageInt) {
            sum += item;
        }

        average = sum / averageInt.length;
        System.out.println("The average of a list of numbers in this array is " + average);
    }

    private static void withoutDouplicates() {
        int[] withoutDoublets = {3, 2, 3, 1, 4, 2, 8, 3};

        for (int i = 0; i < withoutDoublets.length; i++) {
            if (withoutDoublets[i] != 0) {
                for (int j = i + 1; j < withoutDoublets.length; j++) {
                    if (withoutDoublets[i] == withoutDoublets[j]) {
                        withoutDoublets[j] = 0;
                    }
                }
            }
        }

        System.out.println("The array without doublets - " + Arrays.toString(withoutDoublets));
    }
}
