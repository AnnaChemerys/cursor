package com.hw;

import java.text.DecimalFormat;

public class Cuboid extends SpaceShape{

    private int width;
    private int height;
    private int depth;

    DecimalFormat df = new DecimalFormat("###.###");

    public Cuboid(int vertexByX, int vertexByY, int width, int height, int depth) {
        super(vertexByX, vertexByY);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + height * depth + width * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "vertexByX is " + vertexByX +
                ", vertexByY is " + vertexByY +
                ", width is " + width +
                ", height is " + height +
                ", depth is " + depth +
                ", area is " + df.format(getArea()) +
                ", volume is " + df.format(getVolume()) +
                '}';
    }
}
