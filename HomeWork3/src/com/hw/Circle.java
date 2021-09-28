package com.hw;

public class Circle {

    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    public double areaOfCircle() {
        return Math.round(Math.PI * Math.pow(rad, 2));
    }
}