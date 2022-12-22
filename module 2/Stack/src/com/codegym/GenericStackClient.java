package com.codegym;

import static com.codegym.MyGenericStack.stackOfIntegers;
import static com.codegym.MyGenericStack.stackOfStrings;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfStrings();
    }
}
