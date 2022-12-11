package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college = "VIN UNI";

    Student(int r,String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = "coder";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
    public static void main(String[] args) {

    }
}