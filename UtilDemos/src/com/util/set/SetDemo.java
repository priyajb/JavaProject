package com.util.set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
       //Set<String> hashSet=new LinkedHashSet<>();
       // Set<String> hashSet=new HashSet<>();
        Set<String> hashSet=new TreeSet<>();

        hashSet.add("apple");
        hashSet.add("pineapple");
        hashSet.add("banana");
        hashSet.add("kiwi");
        //hashSet.add(null);
        hashSet.add("100");

        System.out.println(hashSet);
        for(String element:hashSet){
            System.out.println(element);
        }
        //method to convert list into set
        List<String> fruits= Arrays.asList("apple","banana","gwawa");
        Set<String> newfruits=new HashSet<>(fruits);
        System.out.println(newfruits);
    }
}
