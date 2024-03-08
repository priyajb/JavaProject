package com.util.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 45, 5, 2, 3, 4, 8);

        List<Integer> list1 = new ArrayList<>();
        System.out.println("........................");
        for (Integer num : list) {
            if (num%2 == 0) {
                list1.add(num);
            }
        }
        System.out.println(".................................");
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            Integer even = iterator.next();
            System.out.println(even);
        }
    }
}
















        /*while(iterator.hasNext()){
            Integer even= iterator.next();
            System.out.println(even);
        }*/


