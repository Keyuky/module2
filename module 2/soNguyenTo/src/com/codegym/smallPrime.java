package com.codegym;

import java.util.Scanner;

public class smallPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập vào một số: ");
        int n = 100;
        System.out.println("Tất cả số nguyên tố nhỏ hơn 100 là: ");
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if(isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }

    private static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return  false;
            }
        }
        return true;
    }
}

