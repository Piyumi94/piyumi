//package com.piyumi.training.java.test;

public class Outlander {

    public static void main(String[] args) {
//        Inner_Demo inner_demo = new Inner_Demo();
//        inner_demo.print();
        Inner_Demo.print();

        System.out.println("main method");

    }


    int num;

    // inner class
    private static class Inner_Demo {
        public static void print() {
            System.out.println("This is an inner class");
        }
    }
}
