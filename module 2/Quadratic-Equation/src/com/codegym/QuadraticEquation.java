package com.codegym;

public class QuadraticEquation {
    private double a, b, c;
    double delta;

    public QuadraticEquation() {
    }
    public QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double  getDiscriminant() {
        delta = b * 2 - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        if (delta >= 0) {
            double r1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
            return r1;
        }
        return getRoot1();
    }
    public double getRoot2() {
        if (delta >= 0) {
            double r2 =(-b - Math.pow(delta, 0.5)) / (2 * a);
            return r2;
        }
        return getRoot2();
    }
}
