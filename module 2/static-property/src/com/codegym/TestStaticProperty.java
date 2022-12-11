package com.codegym;

public class TestStaticProperty {

    public static void main(String[] args) {
        Car car1 = new Car("Nissan Skyline GT-R R32", "2.6-liter twin-turbo V6");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Nissan GT-R R35", "3.8-liter twin-turbo V6");
        System.out.println(Car.numberOfCars);
    }
}
