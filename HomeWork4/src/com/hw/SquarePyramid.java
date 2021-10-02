package com.hw;

import java.text.DecimalFormat;

public class SquarePyramid extends SpaceShape {

    private int baseWidth;
    private int pyramidHeight;

    DecimalFormat df = new DecimalFormat("###.###");

    public SquarePyramid(int vertexByX, int vertexByY, int baseWidth, int pyramidHeight) {
        super(vertexByX, vertexByY);
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    public int getBaseWidth() {
        return baseWidth;
    }

    public int getPyramidHeight() {
        return pyramidHeight;
    }

    @Override
    public double getArea() {
        double apothem = Math.sqrt(Math.pow((baseWidth / (double) 2), 2) + Math.pow(pyramidHeight, 2));
        return Math.pow(baseWidth, 2) + 2 * baseWidth + apothem;
    }

    @Override
    public double getVolume() {
        return (( 1 / (double)3) * Math.pow(baseWidth, 2) * pyramidHeight);
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "vertexByX is " + vertexByX +
                ", vertexByY is " + vertexByY +
                ", baseWidth is " + baseWidth +
                ", pyramidHeight is " + pyramidHeight +
                ", area is " + df.format(getArea()) +
                ", volume is " + df.format(getVolume()) +
                '}';
    }
}
