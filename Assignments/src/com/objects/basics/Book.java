package com.objects.basics;

public class Book {
    String title;
    String author;
    double price;
    String category;

    public Book(String title, String author, double price, String category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    void getDetails() {
        System.out.println("Title :" + title);
        System.out.println("Author :" + author);
        System.out.println("price :" + price);
        System.out.println("category :" + category);
    }
    void checkBookType()
    {
        if(price>500)
        {
            System.out.println("premium book");
        }
        else {
            System.out.println("not premium");
        }
    }
}
