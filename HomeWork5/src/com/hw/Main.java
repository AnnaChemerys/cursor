package com.hw;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task1");
        MyList<Integer> myListInt = new MyList<>();
        myListInt.add(16);
        myListInt.add(147);
        myListInt.add(258);
        myListInt.add(123);
        myListInt.add(357);

        System.out.println("");
        System.out.println(myListInt.toString());

        System.out.println("The largest value is " + myListInt.getLargest(myListInt.myList));
        System.out.println("The smallest value is " + myListInt.getSmallest(myListInt.myList));

        System.out.println("");
        System.out.println("Task2");
        System.out.println("");

        System.out.println("Test for Integer");
        MyListUpdated<Integer> myListUpdatedInteger = new MyListUpdated<>();
        myListUpdatedInteger.add(47);
        myListUpdatedInteger.add(6);
        myListUpdatedInteger.add(115);
        myListUpdatedInteger.add(65);
        myListUpdatedInteger.add(14);
        myListUpdatedInteger.add(747);

        System.out.println(myListUpdatedInteger.toString());

        System.out.println("The largest value is " +
                myListUpdatedInteger.getLargestUpdated(myListUpdatedInteger.myListUpdated));
        System.out.println("The smallest value is " +
                myListUpdatedInteger.getSmallestUpdated(myListUpdatedInteger.myListUpdated));

        System.out.println("");
        System.out.println("Test for String");
        MyListUpdated<String> myListUpdatedString = new MyListUpdated<>();
        myListUpdatedString.add("Behemoth");
        myListUpdatedString.add("Azathoth");
        myListUpdatedString.add("Dagon");
        myListUpdatedString.add("LordOfTheLost");
        myListUpdatedString.add("Kitty");

        System.out.println(myListUpdatedString.toString());

        System.out.println("The largest value is " +
                myListUpdatedString.getLargestUpdated(myListUpdatedString.myListUpdated));
        System.out.println("The smallest value is " +
                myListUpdatedString.getSmallestUpdated(myListUpdatedString.myListUpdated));

        System.out.println("");
        System.out.println("Task3");

        Integer[] myArray = {47, 15, 38, 165, 37, 65, 115};

        MyArrayMinMax<Integer> integerMyArrayMinMax = new MyArrayMinMax<>(myArray);

        System.out.println(integerMyArrayMinMax.toString());

        System.out.println("The highest value is " + integerMyArrayMinMax.getHighest());
        System.out.println("The lowest value is " + integerMyArrayMinMax.getLowest());
    }
}