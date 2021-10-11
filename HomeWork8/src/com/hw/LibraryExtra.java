package com.hw;

import java.time.YearMonth;
import java.util.*;

public class LibraryExtra {

    Map<MyLocalDate, ArrayList<String>> libraryReport = new HashMap<>();

    public void takeBook(MyLocalDate localDate, String bookLabel) {
        if (libraryReport.containsKey(localDate)) {
            libraryReport.get(localDate).add(bookLabel);
        } else {
            ArrayList<String> newBooks = new ArrayList<>();
            newBooks.add(bookLabel);
            libraryReport.put(localDate, newBooks);
        }
    }

    public void takeBook(MyLocalDate localDate, ArrayList<String> booksLabel) {
        if (libraryReport.containsKey(localDate)) {
            libraryReport.get(localDate).addAll(booksLabel);
        } else {
            libraryReport.put(localDate, booksLabel);
        }
    }

    public ArrayList<String> getBooksByDate(MyLocalDate localDate) {
        return libraryReport.get(localDate);
    }

    public void getBooksForMonth(int year, int month) {
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();

        for (int i = 1; i <= daysInMonth; i++) {
            MyLocalDate tempMyLocalDate = new MyLocalDate(year, month, i);
            if (libraryReport.containsKey(tempMyLocalDate)) {
                System.out.println(tempMyLocalDate + " - " + libraryReport.get(tempMyLocalDate).size());
            } else {
                System.out.println(tempMyLocalDate + " - 0");
            }
        }
    }

    public List<String> getAllTheBooks() {
        ArrayList<String> allBooks = new ArrayList<>();

        for (List<String> books : libraryReport.values()) {
            allBooks.addAll(books);
        }

        return allBooks;
    }

    public Set<MyLocalDate> getAllDates() {
        return libraryReport.keySet();
    }
}
