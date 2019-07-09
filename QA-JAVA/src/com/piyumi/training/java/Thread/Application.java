package com.piyumi.training.java.Thread;

public class Application {

    public static void main(String[] args) {

        Printer printer = new Printer();
        Thread thread = new Thread(printer);
        thread.setDaemon(true);
        thread.start();
        //thread.run();

        for(int j=0 ; j<100 ; j++){
            System.out.println("Mixed" + j);
        }
    }






}
