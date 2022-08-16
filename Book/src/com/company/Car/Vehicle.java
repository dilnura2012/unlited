package com.company.Car;

public class Vehicle {

    String name;
    int price;

    public Vehicle() {
    }

    public Vehicle(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void start() {
        System.out.println(name + " start");
    }
}
