package com.list.custom;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("java", "kathy", 900.7),
                new Book("5amclub", "robin", 350.0),
                new Book("Spring", "kathy", 1000.0),
                new Book("leadership", "robin", 433.9));

        System.out.println("before sorting");
        for (Book book1 : books) {
            System.out.println(book1);
        }
        System.out.println("after sorting");
        Collections.sort(books);
        for (Book book1 : books) {
            System.out.println(book1);
        }

    }
}
