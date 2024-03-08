package com.list.custom;

import javax.xml.crypto.dom.DOMCryptoContext;

public class Book implements Comparable<Book> {
    private String Title;
    private String Author;
    private double Price;

    public Book() {
    }

    public Book(String title, String author, double price) {
        Title = title;
        Author = author;
        Price = price;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Price=" + Price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        //String title=this.getTitle();
        Double price1=this.getPrice();
        //return this.getTitle().compareTo(o.getTitle());
        //return this.getAuthor().compareTo(o.getAuthor());
        return ((Double)this.getPrice()).compareTo(o.getPrice());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
