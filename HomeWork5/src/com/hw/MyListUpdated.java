package com.hw;

import java.util.ArrayList;

public class MyListUpdated<T extends Comparable<T>> {

    ArrayList<T> myListUpdated = new ArrayList<>();

    public void add(T element) {
        myListUpdated.add(element);
    }

    public <T extends Comparable<? super T>> T getLargestUpdated(ArrayList<T> myListUpdated) {
        T largest = myListUpdated.get(0);
        for (int i = 1; i < myListUpdated.size(); i++) {
            if (myListUpdated.get(i).compareTo(largest) > 0)
                largest = myListUpdated.get(i);
        }
        return largest;
    }

    public <T extends Comparable<? super T>> T getSmallestUpdated(ArrayList<T> myListUpdated) {
        T smallest = myListUpdated.get(0);
        for (int i = 1; i < myListUpdated.size(); i++) {
            if (myListUpdated.get(i).compareTo(smallest) < 0)
                smallest = myListUpdated.get(i);
        }
        return smallest;
    }

    @Override
    public String toString() {
        return "MyListUpdated is " +
                myListUpdated;
    }
}
