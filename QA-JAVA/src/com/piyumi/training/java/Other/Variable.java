package com.piyumi.training.java.Other;

public class Variable {
    public static void main(String[] args) {
        int x=100;
        int y=100;

        Integer a=1000;
        Integer b=1000;

        System.out.println(x==y);//true
        System.out.println(a==b);//false

        System.out.println("============================");

        int x1=100;
        int y1=100;

        Integer a1=100;
        Integer b1=100;

        System.out.println(x1==y1); //true
        System.out.println(a1==b1); // true

        System.out.println("============================");

        int x2=123;
        int y2=123;

        Integer a2=123;
        Integer b2=123;

        System.out.println(x2==y2);
        System.out.println(a2==b2);

        System.out.println("============================");

        int x3=323;
        int y3=323;

        Integer a3=323;
        Integer b3=323;

        System.out.println(x3==y3);//true
        System.out.println(a3==b3);//false bcz of the byte size.max is 128

    }
}
