package com.piyumi.training.java.HomeWork;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a int value to swap : ");
        int startValue = scanner.nextInt();
        int module,division  = 0;
        int swap = 0;

        while(startValue > 0){
            module = startValue % 10; // 6

            division = startValue / 10 ; // 2325

            swap = swap * 10 + module;
            startValue = division;

        }
        System.out.print("Swap int value : " + swap);    }
}
