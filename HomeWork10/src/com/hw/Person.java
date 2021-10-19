package com.hw;

public class Person {

    private final String name;
    private final int age;
    private final Gender gender;
    private Country country;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age, Gender gender, Country country) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Country getCountry(){
        return country;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }

}
