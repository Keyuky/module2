package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayso[] = {10 ,4 ,6 ,7 ,8 ,6};
        int soCanXoa = sc.nextInt();
        int viTriCanXoa = findIndexElement(dayso, soCanXoa);
        if ( viTriCanXoa == -1) {
            System.out.println("Element not in arr!");
        } else {
           dayso = xoaMotPhanTu(dayso, viTriCanXoa);
        }
        for (int i = 0; i < dayso.length; i++) {
            System.out.print(dayso[i] + " ");
        }
}
static int findIndexElement(int[] dayso, int phanTu) {
    int viTri = -1;
    for (int i = 0; i < dayso.length; i++) {
        if (dayso[i] == phanTu) {
            viTri = i;
        }
    }
    return viTri;
}
static int[] xoaMotPhanTu(int[] dayso, int viTri) {
        int[] daySoMoi = new int[dayso.length - 1];
        for (int i = 0; i < viTri; i++) {
            daySoMoi[i] = dayso[i];
        }
        for (int i =viTri + 1; i < dayso.length; i++) {
            daySoMoi[i-1] = dayso[i];
        }
        return daySoMoi;
}
}