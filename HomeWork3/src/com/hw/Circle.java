package com.hw;

public class Circle {

    private double rad = 1;

    public Circle(double rad) {
        this.rad = rad;
    }

    public double areaOfCircle() {
        return Math.round(Math.PI * Math.pow(rad, 2));
        //System.out.println();
        }
    }