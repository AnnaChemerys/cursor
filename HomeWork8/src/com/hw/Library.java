package com.hw;

import java.util.*;

public class Library {

    Map<MyLocalDate, String> libraryReport = new HashMap<>();

    public void takeBook(MyLocalDate localDate, String bookLabel) {
        libraryReport.put(localDate, bookLabel);
    }

    public String getBooksByDate(MyLocalDate localDate) {
        return libraryReport.getOrDefault(localDate, "There are no books for this date");
        /* моё изначальное решение
        if (libraryReport.containsKey(localDate))
            return libraryReport.get(localDate);
        else
            return "There are no books for this date";
         */
    }

    public List<String> getAllTheBooks() {
        return new ArrayList<>(libraryReport.values());
    }

    public Set<MyLocalDate> getAllDates() {
        return libraryReport.keySet();
    }
}
