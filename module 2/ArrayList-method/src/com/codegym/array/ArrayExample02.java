package com.codegym.array;

public class ArrayExample02 {
    public static void main(String[] args) {
        String[] originalArr = {"01", "02", "03", "04", "05"};
        System.out.println("Original array length is: " + originalArr.length);

        System.out.print("\nOriginal array is: ");
        for (String oElement : originalArr) {
            System.out.print(oElement + " ");
        }
    }
}