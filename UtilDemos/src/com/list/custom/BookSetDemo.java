package com.list.custom;

import javax.sound.midi.Soundbank;
import java.util.*;

public class BookSetDemo {
    public static void main(String[] args) {
        List<Book> bookList= Arrays.asList(
                new Book("java","kathy",900),
                new Book("5amclub", "robin", 350),
                new Book("Spring", "kathy", 1000),
                new Book("leadership", "robin", 433));

        for(Book book:bookList){
            System.out.println(book);
        }
        System.out.println(".......");
        Set<Book> bookSet=new LinkedHashSet<>(bookList);
        for (Book book:bookSet)
        {
            System.out.println(book);
        }
        System.out.println();
        Set<Book> bookSet1=new TreeSet<>(bookSet);
        for(Book book:bookSet1)
        {
            System.out.println(book);
        }
    }
}
