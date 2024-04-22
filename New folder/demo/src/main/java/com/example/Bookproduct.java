package com.example;

import java.util.Scanner;

public class Bookproduct extends Product {
    private String author,publisher;

    public Bookproduct() {
        super();
        this.author = null;
        this.publisher = null;
    }
    
    public Bookproduct(int id , String name , float price,String author, String publisher) {
        super(id,name,price);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}