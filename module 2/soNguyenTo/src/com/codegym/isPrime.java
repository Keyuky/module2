package com.codegym;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào một số: ");
        int n = sc.nextInt();
        System.out.println("Số nguyên tố đầu tiên là: " + n);
        int countN = 0;
        int i = 2;
        while (countN < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                countN++;
            }
            i++;
        }
    }

    private static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
