package com.objects.basics;

public class BookMain {
    public static void main(String[] args) {
  Book book=new Book("JAVA ACTION","KELVIN",900,"IT");
   book.title="java";
   book.author="kelvin";
   book.price=900;
   book.category="it";

   book.getDetails();
   book.checkBookType();
    }
}
