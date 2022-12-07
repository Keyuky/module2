package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 0;
        int month = 0;
        double interestRate = 3.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền gữi: ");
        money = scanner.nextDouble();

        System.out.println("Nhập vào tháng gữi: ");
        month = scanner.nextInt();

        double totalInterest = money * (1 +(interestRate/100)/12 * month);
        System.out.println("Tổng lãi suất là: " + totalInterest);
    }
}