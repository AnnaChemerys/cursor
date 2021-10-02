package com.hw;

public abstract class Shape {
    protected int vertexByX;
    protected int vertexByY;

    public Shape(int vertexByX, int vertexByY) {
        this.vertexByX = vertexByX;
        this.vertexByY = vertexByY;
    }
}