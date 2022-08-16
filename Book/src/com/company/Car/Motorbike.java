package com.company.Car;

public class Motorbike extends Car {

    String fuel;

    public Motorbike(String name, int price, String brand, String fuel) {
        super(name, price, brand);
        this.fuel = fuel;
    }

    public void stop() {
        System.out.println(name + " stop");
    }

    public void show() {
        System.out.println("Brand " + brand);
        System.out.println("Name " + name);
        System.out.println("Price " + price);
        System.out.println("Fuel " + fuel);

    }

}
