package com.piyumi.training.java.model;

public class Airplane implements Vehical {
    @Override
    public void move() {
        System.out.println("airplane took off");
    }

    @Override
    public void broke() {
        System.out.println("airplane broke");
    }
}
