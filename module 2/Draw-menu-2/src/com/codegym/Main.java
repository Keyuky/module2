package com.codegym;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle top-left");
        System.out.println("3. Draw the square triangle top-right");
        System.out.println("4. Draw the square triangle bot-left");
        System.out.println("5. Draw the square triangle bot-right");
        System.out.println("6. Draw the isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");

        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 2:
                    for (int i = 0; i < h; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < h; i++){
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = i; j < h; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < h; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                    case 5:
                        for (int i = 0; i < h; ++i) {
                            for (int j = i; j < h - 1; j++) {
                                System.out.print(" ");
                            }
                            for (int j = 0; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                case 6:
                    for (int i = 0; i < h; ++i) {
                        for (int j = i; j < h - 1; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    break;
            }
        }
    }
}