package com.piyumi.training.java.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map2 {
    static Map<String, Integer> map =new HashMap<>();

    public static void sortbyvalue(){
        TreeMap<String, Integer> sort = new TreeMap<>();
        sort.putAll(map);

//        for (Map.Entry<String, Integer> entry: sort.entrySet()){
//            System.out.println("Key = " + entry.getKey() +",value = " + entry.getValue());
//        }

        LinkedHashMap<Integer, String> sortvalue = new LinkedHashMap<>();
             map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                     .forEachOrdered(x-> {
                         String put = sortvalue.put(x.getValue(), x.getKey());
                     });
        System.out.println(sortvalue);
    }

    public static void main(String[] args) {
        map.put("kamal", 10);
        map.put("nimal", 89);
        map.put("sunil", 45);
        map.put("nihal",67);

        sortbyvalue();
    }
}
