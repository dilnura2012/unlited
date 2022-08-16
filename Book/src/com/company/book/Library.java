package com.company.book;

import java.util.Scanner;

import static java.lang.System.in;

public class Library extends Book implements BookInterface {

    Scanner scanner = new Scanner(in);
    String[] name = new String[100];//
    int[] price = new int[100];//
    int[] year = new int[100];//
    int count = 0;


    @Override
    public void add() {
        System.out.println("Book Add");
        scanner = new Scanner(in);
        System.out.print("Book name write: ");
        setName(scanner.nextLine());

        System.out.print("Book price write: ");
        setPrice(scanner.nextInt());

        System.out.print("Book year write: ");
        setYear(scanner.nextInt());
        name[count] = getName();
        price[count] = getPrice();
        year[count] = getYear();

        count++;
    }


    @Override
    public void list() {
        System.out.println("Book list");

        for (int i = 0; i < count; i++) {
            System.out.println("=====================");
            System.out.println(name[i] + " " + price[i] + " " + year[i]);
            System.out.println("=====================");
        }

    }

    @Override
    public void search() {

    }
}
