package com.hw;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.hw.Gender.FEMALE;
import static com.hw.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task1");
        System.out.println("Adult but not retired people ");

        Stream.of(new Person("Anna", 24, FEMALE),
                new Person("Sophie", 25, FEMALE),
                new Person("Volodymyr", 33, MALE),
                new Person("Yaroslav", 11, MALE),
                new Person("Svetlana", 71, FEMALE))
                .filter(i -> i.getAge() >= 18 && i.getAge() < 60)
                .map(i -> i.getName() + " - " + i.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
