package com.hw;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        //--- Task 1 ---
        System.out.println("Task 1");

        Circle circle1 = new Circle(16.13);

        System.out.println("Area of a circle is " + circle1.areaOfCircle());

        //--- Task 2 ---
        System.out.println("");
        System.out.println("Task 2");

        Car car1 = new Car();

        System.out.println(car1.startEngine());
        System.out.println(car1.startDriving());
        System.out.println(car1.keepSpeed());
        System.out.println(car1.toString());

        System.out.println(car1.stopDriving());
        System.out.println(car1.stopEngine());
        System.out.println(car1.toString());


        //--- Task 3 ---
        System.out.println("");
        System.out.println("Task 3");

        Money money1 = new Money(640, (byte) 2);
        Money money2 = new Money(100, (byte) 15);
        DecimalFormat df = new DecimalFormat("###.###");

        System.out.println("The money1 is " + money1);
        System.out.println("The money2 is " + money2);

        System.out.println("Sum money1 + money2 = " + money1.addMoney(money2));

        System.out.println("Subtraction money1 - money2 = " + money1.subtractionMoney(money2));
        System.out.println("Subtraction money2 - money1 = " + money2.subtractionMoney(money1));

        System.out.println("The result of division money1 by money2 = " + df.format(money1.divisionOfSums(money2)));
        System.out.println("The result of division money2 by money1 =  " + df.format(money2.divisionOfSums(money1)));

        System.out.println("The result of division money1 with fractional =  " + money1.divisionByFractionalNumber(16.5));
        System.out.println("The result of division money2 with fractional =  " + money2.divisionByFractionalNumber(16.5));

        System.out.println("The result of multiply money1 with fractional =  " + money1.multiplyByFractionalNumber(34.7));
        System.out.println("The result of multiply money2 with fractional =  " + money2.multiplyByFractionalNumber(34.7));

        System.out.println("The money1 is less money2 =  " + money1.isLess(money2));
        System.out.println("The money2 is less money1 =  " + money2.isLess(money1));

        System.out.println("The money1 is equals to money2 =  " + money1.equals(money2));
        System.out.println("The money2 is equals to money1 =  " + money2.equals(money1));

    }
}