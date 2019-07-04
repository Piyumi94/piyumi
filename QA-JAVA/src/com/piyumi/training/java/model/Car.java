package com.piyumi.training.java.model;

public class Car implements Vehical{
    @Override
    public void move() {
        System.out.println("car is moving");
    }

    @Override
    public void broke() {
        System.out.println("car broke");
    }

}
