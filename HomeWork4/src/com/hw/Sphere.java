package com.hw;

import java.text.DecimalFormat;

public class Sphere extends SpaceShape {

    private int radius;

    DecimalFormat df = new DecimalFormat("###.###");

    public Sphere(int vertexByX, int vertexByY, int radius) {
        super(vertexByX, vertexByY);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 / (double) 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "vertexByX is " + vertexByX +
                ", vertexByY is " + vertexByY +
                ", radius is " + radius +
                ", area is " + df.format(getArea()) +
                ", volume is " + df.format(getVolume()) +
                '}';
    }
}
