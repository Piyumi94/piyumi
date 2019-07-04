package com.piyumi.training.java.HomeWork;

public class Exercise2 {
    public static void printTable(int n) {
        for (int i = 1; i < n + 1; i++) {
            System.out.print(i);
            for (int j = 1; j < n + 1; j++) {
                if (i * j > 9)
                    System.out.print("   " + (i * j));
                else if (i * j > 99)
                    System.out.print("  " + (i * j));
                else
                    System.out.print("    " + (i * j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTable(10);
    }
}
