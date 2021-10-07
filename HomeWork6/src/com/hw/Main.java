package com.hw;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task1");
        System.out.println("");
        ArrayList<Integer> divisibleByThree = new ArrayList<>();
        divisibleByThree.add(3);
        divisibleByThree.add(9);
        divisibleByThree.add(11);
        divisibleByThree.add(18);
        divisibleByThree.add(20);
        divisibleByThree.add(22);
        System.out.println("New ArrayList with numbers which are divisible by 3 is " + divisibleByThree);
        divisibleByThree.removeIf(integer -> integer % 3 == 0);
        System.out.println("New ArrayList without numbers which are divisible by 3 is " + divisibleByThree);

        System.out.println("");
        System.out.println("Task2");
        System.out.println("");

        ArrayList<String> arrayOfFruits = new ArrayList<>();
        arrayOfFruits.add("Banana");
        arrayOfFruits.add("Melon");
        arrayOfFruits.add("Orange");
        arrayOfFruits.add("Mango");
        arrayOfFruits.add("Lime");
        arrayOfFruits.add("Carambola");
        arrayOfFruits.add("Coconut");
        System.out.println("First try");
        replaceOrange(arrayOfFruits);
        System.out.println("Second try");
        ArrayList<String> arrayOfFruits1 = new ArrayList<>();
        arrayOfFruits1.add("Banana");
        arrayOfFruits1.add("Melon");
        arrayOfFruits1.add("Mango");
        arrayOfFruits1.add("Lime");
        arrayOfFruits1.add("Carambola");
        arrayOfFruits1.add("Coconut");
        replaceOrange(arrayOfFruits1);

        System.out.println("");
        System.out.println("Task3");
        System.out.println("");

        Integer[] arrayOfInts = {15, 40, 80, 47, 66};
        Integer[] arrayOfInts2 = {13, 16, 6, 7, 4};
        Integer[] arrayOfInts3 = {15, 40, 80, 47, 66};
        String[] arrayOfString = {"Metallica", "Oomph!", "Lord Of The Lost", "Scorpions", "Trivium"};
        String[] arrayOfString2 = {"Claude Monet", "Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Salvador Dali"};
        String[] arrayOfString3 = {"Behemoth", "Mushroomhead", "Die Kreatur", "Blackbriar", "Metallica"};

        ArrayList<Integer> listOfInts = new ArrayList<>();
        Collections.addAll(listOfInts, arrayOfInts);
        ArrayList<Integer> listOfInts2 = new ArrayList<>();
        Collections.addAll(listOfInts2, arrayOfInts2);
        ArrayList<Integer> listOfInts3 = new ArrayList<>();
        Collections.addAll(listOfInts3, arrayOfInts3);

        ArrayList<String> listOfString = new ArrayList<>();
        Collections.addAll(listOfString, arrayOfString);
        ArrayList<String> listOfString2 = new ArrayList<>();
        Collections.addAll(listOfString2, arrayOfString2);
        ArrayList<String> listOfString3 = new ArrayList<>();
        Collections.addAll(listOfString3, arrayOfString3);

        System.out.println("listOfInts and listOfInts2 have at least one similar element is " + checkSimilarElement(listOfInts, listOfInts2));
        System.out.println("listOfInts and listOfInts3 have at least one similar element is " + checkSimilarElement(listOfInts, listOfInts3));
        System.out.println("listOfString and listOfString2 have at least one similar element is " + checkSimilarElement(listOfString, listOfString2));
        System.out.println("listOfString and listOfString3 have at least one similar element is " + checkSimilarElement(listOfString, listOfString3));
    }

    public static void replaceOrange(ArrayList<String> newArray) {
        if (newArray.contains("Orange")) {
            int i = newArray.indexOf("Orange");
            newArray.set(i, "Grapefruit");
            System.out.println("NewArray with grapefruit instead of orange " + newArray);
        } else {
            System.out.println("Orange doesn't present in this list of fruits");
        }
    }

    public static <T> boolean checkSimilarElement(ArrayList<T> newList, ArrayList<T> newList1) {
        for (var element : newList) {
            if (newList1.contains(element))
                return true;
        }
        return false;
    }
}
