package com.hw;

import java.text.DecimalFormat;

public class Rectangle extends PlaneShape {

    private int width;
    private int height;

    DecimalFormat df = new DecimalFormat("###.###");

    public Rectangle(int vertexByX, int vertexByY, int width, int height) {
        super(vertexByX, vertexByY);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width is " + width +
                ", height is " + height +
                ", vertexByX is " + vertexByX +
                ", vertexByY is " + vertexByY +
                ", perimeter is " + df.format(getPerimeter()) +
                ", area is " + df.format(getArea()) +
                '}';
    }
}
