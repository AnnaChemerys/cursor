package com.hw;

public class Car {

    private boolean startTheEngine;
    private int speed;
    private boolean adaptiveCruiseControl;

    public Car() {
        startTheEngine = false;
        speed = 0;
        adaptiveCruiseControl = false;
    }

    public String startEngine() {
        startTheEngine = true;
        return "Engine was started";
    }

    public String stopEngine() {
        startTheEngine = false;
        return "Engine was stopped";
    }

    public String startDriving() {
        speed = 10;
        return "Current speed - " + speed + "km";
    }

    public String stopDriving() {
        speed = 0;
        adaptiveCruiseControl = false;
        return "Current speed - " + speed + "km";
    }

    public String keepSpeed() {
        if (speed > 0 && startTheEngine == true) {
            adaptiveCruiseControl = true;
            return "Car rides. Adaptive cruise control is on. The current speed - " + speed;
        } else {
            return "Car engine not started or speed is equals to 0. Adaptive cruise control can not be turned on.";
        }
    }

    @Override
    public String toString() {
        return "Car engine started - " + startTheEngine +
                ", speed = " + speed +
                ", adaptiveCruiseControl turned on - " + adaptiveCruiseControl;
    }
}
