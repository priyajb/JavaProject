package com.bookapp.util;

import com.bookapp.model.Book;

import java.util.Arrays;
import java.util.List;

public class BookDetails {
    public static List<Book> showBooks(){
        return Arrays.asList(
                new Book("java in action","kathy","tech",1,900),
                new Book("html for dummies","ben john","tech",2,799),
                new Book("seven habits","enid ben","selfhelp",3,699),
                new Book("java in action","ben john","fiction",4,567));


    }
}
