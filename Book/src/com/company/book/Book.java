package com.company.book;

public class Book  {

   private String name;
   private int price;
   private int year;

    public Book() {
    }

    public Book(String name, int price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
