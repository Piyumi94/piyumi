package com.piyumi.training.java.model;

public class Application {
    public static void main(String[] args) {
       // System.out.println("hello java");

        Car car = new Car();
        car.move();
        car.broke();

        System.out.println("===========beacuse car is a vehical===============");

        Vehical car1 = new Car();
        car1.move();
        car1.broke();

        System.out.println("==========================");

        Airplane airplane =new  Airplane();
        airplane.move();
        airplane.broke();

        System.out.println("============beacuse airplane is a vehical==============");

        Vehical airplane1 =new  Airplane();
        airplane.move();
        airplane.broke();

        System.out.println("==========================");

        Outlander outlander = new Outlander();
        outlander.broke();
        outlander.move();
        outlander.tyres();

    }
}
