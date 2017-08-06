package com.lugowoy.tasks.arrays.onedimensional.determineTheNumberOfPairsOfPointsTheDistanceBetweenWhichIsMaximally;

/** Created by Konstantin Lugowoy on 27.03.2017. */

public class Point {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
