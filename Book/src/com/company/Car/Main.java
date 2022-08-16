package com.company.Car;

public class Main {

    public static void main(String[] args) {

        Car  car = new Car("X7",12000,"BMW");
        car.show();
        car.start();
        car.speed(150);

        System.out.println("+++++++++++++++");
        Motorbike motorbike = new Motorbike("XT564X",5000,"Honda","Gasoline");
        motorbike.show();
        motorbike.start();
        motorbike.speed(170);
        motorbike.stop();


    }

}
