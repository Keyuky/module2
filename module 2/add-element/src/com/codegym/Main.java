package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int atIndex = 1;
        int value = 9;
        int n = 5;
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        System.out.println("Trước khi thêm");
        for (int element : a) {
            System.out.println(element + " ");
        }
        System.out.println();
        for (int i = n; i < atIndex; i--) {
            a[i] = a[i - 1];
        }
        a[atIndex] = value;
        System.out.println("Sau khi chèn");
        for (int element : a) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}