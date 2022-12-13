package com.codegym;

public class Cylinder extends Circle {
    public double height = 5.0;

    public Cylinder() {
    }

    public Cylinder(double height, double radius, String color) {
    super(radius, color);
    this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.PI * Math.pow(radius,2) * this.height;
    }
     @Override
    public String toString() {
        return "" + getVolume();
     }
}
