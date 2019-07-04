package com.piyumi.training.java.CollectionFramework;


import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        System.out.println("Initial site " +list.size());

        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");

        System.out.println("after adding size " + list.size());

        list.remove(3);

        System.out.println("after remove size " + list.size());


        for(String string: list){
            System.out.println(string);
        }
    }
}
