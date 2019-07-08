package com.piyumi.training.java.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {

    static Map<String, Integer> map =new HashMap<>();

    public static void sortbykey(){
        TreeMap<String, Integer> sort = new TreeMap<>();
        sort.putAll(map);

        for (Map.Entry<String, Integer> entry: sort.entrySet()){
            System.out.println("Key = " + entry.getKey() +",value = " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        map.put("kamal", 10);
        map.put("nimal", 89);
        map.put("sunil", 45);
        map.put("nihal",67);

        sortbykey();
    }



}
