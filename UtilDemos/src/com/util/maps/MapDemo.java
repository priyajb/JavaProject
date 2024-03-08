package com.util.maps;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        //Map<Integer, String> map = new HashMap<>();
        Map<Integer,String> map=new LinkedHashMap<>();
        //Map<Integer,String> map=new TreeMap<>();
        map.put(1, "java");
        map.put(10, "spring");
        map.put(null, "css");
        map.put(4, "ds");
        map.put(101, null);
        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(102);
        System.out.println(map.getOrDefault(102, "jsp"));
        System.out.println(map.containsKey(1));

        System.out.println("............");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println("................");
        System.out.println("using entry set");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
    }
}

