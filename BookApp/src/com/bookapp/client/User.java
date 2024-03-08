package com.bookapp.client;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

import java.util.List;
import java.util.Scanner;

public class User {
    public static void main(String[] args) throws BookNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the choice");
        int choice = sc.nextInt();


        IBookService bookService = new BookServiceImpl();
        List<Book> booksByCategory;
        List<Book> booksByAuthor;
        List<Book> booksByPrice;
        List<Book> booksById;

        try {
            switch (choice) {
                case 1:
                    System.out.println("enter category");
                    String category = sc.next();
                    booksByCategory = bookService.getByCategory(category);
                    for (Book book : booksByCategory) {
                        System.out.println(book);
                    }
                    break;

                case 2:
                    System.out.println("enter the author");
                    String author = sc.next();
                    booksByAuthor = bookService.getByAuthorStartsWith(author);
                    for (Book book : booksByAuthor) {
                        System.out.println(book);
                    }
                    break;

                case 3:
                    System.out.println("enter the price");
                    Double price = sc.nextDouble();
                    booksByPrice = bookService.getByPriceLessThan(price);
                    for (Book book : booksByPrice) {
                        System.out.println(book);
                    }
                    break;

                case 4:
                    System.out.println("enter the id");
                    int bookId = sc.nextInt();
                    booksById=bookService.getById(bookId);
                    for (Book book : booksById) {
                        System.out.println(book);
                    }
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}







