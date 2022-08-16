package com.company.Car;

public class Car extends Vehicle {

    String brand;

    public Car() {
    }

    public Car(String name, int price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public void speed(int speed) {
        System.out.println(speed + " speed");
    }


    public void show(){
        System.out.println("Brand "+brand);
        System.out.println("Name "+name);
        System.out.println("Price "+price);

    }
}
