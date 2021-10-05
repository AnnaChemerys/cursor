package com.hw;

import java.util.ArrayList;

public class MyList<T extends Number> {

    public ArrayList<T> myList = new ArrayList<>();

    public void add(T element) {
        myList.add(element);
    }

    public <T extends Comparable<? super T>> T getLargest(ArrayList<T> myList) {
        T largest = myList.get(0);
        for (T t : myList) {
            if (t.compareTo(largest) > 0)
                largest = t;
        }
        return largest;
    }

    public <T extends Comparable<? super T>> T getSmallest(ArrayList<T> myList) {
        T smallest = myList.get(0);
        for (T t : myList) {
            if (t.compareTo(smallest) < 0)
                smallest = t;
        }
        return smallest;
    }

    @Override
    public String toString() {
        return "ArrayList is " +
                "myList = " + myList;
    }
}
