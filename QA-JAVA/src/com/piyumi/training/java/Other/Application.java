package com.piyumi.training.java.Other;

import com.piyumi.training.java.model.Airplane;
import com.piyumi.training.java.model.Car;
import com.piyumi.training.java.model.Outlander;
import com.piyumi.training.java.model.Vehical;

public class Application {
    public static void main(String[] args) {
       // System.out.println("hello java");

        Car car = new Car();
        car.move();
        car.broke();

        System.out.println("===========beacuse car is a vehical===============");

        Vehical car1 = new Car();
        car.move();
        car.broke();

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
