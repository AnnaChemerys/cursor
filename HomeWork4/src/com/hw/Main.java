package com.hw;

public class Main {

    public static void main(String[] args) {
        Shape[] arrayOfShapes = new Shape[6];
        arrayOfShapes[0] = new Triangle(4, 13, 17, 15, 10, 5);
        arrayOfShapes[1] = new Rectangle(4, 7, 6, 13);
        arrayOfShapes[2] = new Circle(7, 4, 6);
        arrayOfShapes[3] = new SquarePyramid(6, 4, 7, 16);
        arrayOfShapes[4] = new Cuboid(6, 15, 7, 20, 16);
        arrayOfShapes[5] = new Sphere(13, 7, 34);

        for (Shape shape : arrayOfShapes) {
            System.out.println(shape);
        }
    }
}
