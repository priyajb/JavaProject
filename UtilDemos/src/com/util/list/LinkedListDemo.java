package com.util.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("JAVA");//0
        list.add("PYTHON");//1
        list.add("HTML");//2
        list.offer("RUBY");//3
        System.out.println(list);
        list.addFirst("CSS");
        list.addLast("SPRING");
        list.set(1, "React");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
