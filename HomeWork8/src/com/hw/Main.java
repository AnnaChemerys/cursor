package com.hw;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Taks 1 ");

        Library newLibrary = new Library();
        newLibrary.takeBook(new MyLocalDate(2021, 5, 16), "Dagon");
        newLibrary.takeBook(new MyLocalDate(2021, 5, 21), "Good Omens");

        System.out.println("Get books by day - " + newLibrary.getBooksByDate(new MyLocalDate(2021, 5, 16)));
        System.out.println("Get books by day - " + newLibrary.getBooksByDate(new MyLocalDate(2021, 10, 16)));

        System.out.println("All books " + newLibrary.getAllTheBooks());
        System.out.println("All dates " + newLibrary.getAllDates());

        System.out.println("");

        System.out.println("Task * ");

        LibraryExtra newLibraryExtra = new LibraryExtra();
        newLibraryExtra.takeBook(new MyLocalDate(2021, 6, 14), "Small Gods 1");
        newLibraryExtra.takeBook(new MyLocalDate(2021, 6, 14), "Small Gods 2");
        newLibraryExtra.takeBook(new MyLocalDate(2021, 7, 14), "Small 1");
        newLibraryExtra.takeBook(new MyLocalDate(2021, 6, 11), "Small Gods 3");

        ArrayList<String> books = new ArrayList<>();
        books.add("Small 2");
        books.add("Small Gods 4");

        newLibraryExtra.takeBook(new MyLocalDate(2021, 8, 14), books);

        System.out.println("All books " + newLibraryExtra.getAllTheBooks());
        System.out.println("All dates " + newLibraryExtra.getAllDates());

        newLibraryExtra.getBooksForMonth(2021, 6);
    }
}
