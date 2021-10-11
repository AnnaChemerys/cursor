package com.hw;

import java.time.LocalDate;
import java.util.Objects;

public class MyLocalDate {
    private final LocalDate localDate;

    public MyLocalDate(int year, int month, int day) {
        localDate = LocalDate.of(year, month, day);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLocalDate that = (MyLocalDate) o;
        return Objects.equals(localDate, that.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localDate);
    }

    @Override
    public String toString() {
        return localDate.toString();
    }
}


