package com.codegym;

public class QuadraticEquation {
    private double a, b, c;
    double delta;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
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
    public double delta() {
        return Math.pow(b,2) - 4 * a * c;
    }

    public void Drr() {
        if (delta() < 0) {
            System.out.println("phương trình vô nghiệm");
        }
        if (delta() == 0) {
            double d = -b / (2 * a);
            System.out.println("Phương trình có 1 nghiệm: " + d);
        }
        if (delta() > 0) {
            double r1 = (-b + Math.sqrt(this.delta())) / (2 * a);
            double r2 = (-b - Math.sqrt(this.delta())) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm là: " + "r1: " + r1 + " r2: " + r2);
        }
    }
}

//    public double getRoot1() {
//        if (delta >= 0) {
//            double r1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
//            return r1;
//        }
//        return getRoot1();
//    }
//    public double getRoot2() {
//        if (delta >= 0) {
//            double r2 =(-b - Math.pow(delta, 0.5)) / (2 * a);
//            return r2;
//        }
//        return getRoot2();
//    }
