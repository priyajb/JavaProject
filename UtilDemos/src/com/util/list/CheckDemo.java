package com.util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("jack fruit");
        list.add("banana");
        list.add("watermelon");
        list.add("apple");
        list.add("kivi");
        System.out.println(list);

        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        for(String fruits:list)
        {
            if(fruits.contains("green apple"))
            {
                list1.add(fruits);
                System.out.println("fruits are available");
                break;
            }
            else if(fruits.contains("grapes")){
                list2.add(fruits);
                System.out.println("fruits are not available");
                break;
            }

        }
        System.out.println("..........................");
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            String str= iterator.next();
            System.out.println(str);
        }

    }
}
