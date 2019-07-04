package com.piyumi.training.java.SamInterface.LamdaExp;

public class Application {
    public static void main(String[] args) {

        Printer printer = t -> System.out.println(t); // For argumented methods
        // printer =()-> System.out.println(); //for non argument methods

        printer.print("QA");
        printer.print("dev");
    }

}
