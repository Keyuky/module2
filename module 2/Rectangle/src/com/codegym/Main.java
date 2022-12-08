package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = sc.nextDouble();
        System.out.println("Enter the height:");
        double height = sc.nextDouble();
        Rectangle rect = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rect.display());
        System.out.println("Perimeter of the Rectangle: " + rect.getPerimeter());
        System.out.println("Area of the Rectangle: " + rect.getArea());
    }
}