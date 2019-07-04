package com.piyumi.training.java.SamInterface.AnnonimousClass;

public class Application {
    public static void main(String[] args) {

        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("annonimus class");
            }
        };
        printer.print();
    }
}
