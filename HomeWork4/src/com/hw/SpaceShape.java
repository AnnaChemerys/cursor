package com.hw;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(int vertexByX, int vertexByY) {
        super(vertexByX, vertexByY);
    }
}
