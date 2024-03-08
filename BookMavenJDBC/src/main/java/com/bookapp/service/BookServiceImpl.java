package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

import java.util.List;

public class BookServiceImpl implements IBookService {
    public void addBook(Book book) {

    }

    public void updateBook(int bookId, double price) {

    }

    public void deleteBook(int bookId) {

    }

    public List<Book> finalAll() {
        return null;
    }

    public List<Book> findByAuthorContains(String author) throws BookNotFoundException {
        return null;
    }

    public List<Book> findByCategory(String category) throws BookNotFoundException {
        return null;
    }

    public List<Book> findByPriceLessThan(double price) throws BookNotFoundException {
        return null;
    }

    public List<Book> findByAuthorCategory(String author, String categoty) throws BookNotFoundException {
        return null;
    }

    public Book findById(int bookId) throws BookNotFoundException {
        return null;
    }
}
