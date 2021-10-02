package com.hw;

import java.text.DecimalFormat;

public class Circle extends PlaneShape{

    private int radius;

    DecimalFormat df = new DecimalFormat("###.###");

    public Circle(int vertexByX, int vertexByY, int radius) {
        super(vertexByX, vertexByY);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "vertexByX is " + vertexByX +
                ", vertexByY is " + vertexByY +
                ", radius is" + radius +
                ", perimeter is " + df.format(getPerimeter()) +
                ", area is " + df.format(getArea()) +
                '}';
    }
}
