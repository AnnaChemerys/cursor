package com.hw;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(int vertexByX, int vertexByY) {
        super(vertexByX, vertexByY);
    }
}
