package com.util.list;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("html");
        list.add("python");
        list.add(1,"maven");
        System.out.println(list);
        list.set(2,"javascript");
        System.out.println(list.size());

        Iterator<String> iterator=list.iterator();
            while(iterator.hasNext()){
                String str= iterator.next();
                System.out.println(str);
            }
        System.out.println("..........");

        ListIterator<String> listIterator=list.listIterator();
        while(listIterator.hasPrevious()){
            String str=listIterator.next();
            System.out.println(str);
        }
        System.out.println("sorting the list");
        Collections.sort(list);
        for(String val:list)
        {
            System.out.println(val.toUpperCase());
        }
    }
}
