package com.codegym;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. hiển thị danh sách sinh viên");
        System.out.println("2. xem thông tin chi tiết sinh viên");
        System.out.println("3. thêm mới sinh viên");
        System.out.println("4. sửa thông tin sinh viên");
        System.out.println("5. xóa sinh viên");
        System.out.println("Enter your choice");
        int choice;
        do {
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("hiển thị danh sách sinh viên");
                    break;
                case 2:
                    System.out.println(" xem thông tin chi tiết sinh viên");
                    break;
                case 3:
                    System.out.println("thêm mới sinh viên");
                    break;
                case 4:
                    System.out.println("sửa thông tin sinh viên");
                    break;
                case 5:
                    System.out.println("xoá sinh viên");
                    break;
                default:
                    System.out.println("No Choice");
            }
        } while (choice != 0);
    }
}
