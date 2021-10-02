package com.hw;

import java.text.DecimalFormat;

public class Triangle extends PlaneShape {

    private int vertexByX2;
    private int vertexByY2;
    private int vertexByX3;
    private int vertexByY3;
    private double sideA;
    private double sideB;
    private double sideC;
    private double semiPerimeter;

    DecimalFormat df = new DecimalFormat("###.###");

    public Triangle(int vertexByX, int vertexByY, int vertexByX2, int vertexByY2, int vertexByX3, int vertexByY3) {
        super(vertexByX, vertexByY);
        this.vertexByX2 = vertexByX2;
        this.vertexByY2 = vertexByY2;
        this.vertexByX3 = vertexByX3;
        this.vertexByY3 = vertexByY3;

        calculateDistanceForAllVertex();
        calculateSemiPerimeter();
    }

    private void calculateSemiPerimeter() {
        semiPerimeter = 0.5 * (sideA + sideB + sideC);
    }

    private void calculateDistanceForAllVertex() {
        sideA = getDistance(vertexByX, vertexByY, vertexByX2, vertexByY2);
        sideB = getDistance(vertexByX2, vertexByY2, vertexByX3, vertexByY3);
        sideC = getDistance(vertexByX, vertexByY, vertexByX3, vertexByY3);
    }

    private double getDistance(int byX1, int byY1, int byX2, int byY2) {
        return Math.sqrt(((Math.pow((byX1 - byX2), 2)) + Math.pow((byY1 - byY2), 2)));
    }

    public int getVertexByX2() {
        return vertexByX2;
    }

    public int getVertexByY2() {
        return vertexByY2;
    }

    public int getVertexByX3() {
        return vertexByX3;
    }

    public int getVertexByY3() {
        return vertexByY3;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        return Math.sqrt(semiPerimeter * ((semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC)));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "vertexByX is " + vertexByX +
                ", vertexByY is " + vertexByY +
                ", vertexByX2 is " + vertexByX2 +
                ", vertexByY2 is " + vertexByY2 +
                ", vertexByX3 is " + vertexByX3 +
                ", vertexByY3 is " + vertexByY3 +
                ", sideA is " + df.format(sideA) +
                ", sideB is " + df.format(sideB) +
                ", sideC is " + df.format(sideC) +
                ", semiPerimeter is " + df.format(semiPerimeter) +
                ", perimeter is " + df.format(getPerimeter()) +
                ", area is " + df.format(getArea()) +
                '}';
    }
}
