package com.company.book;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        Library book = new Library();

        System.out.println("Book King");
        while (true) {

            System.out.println("1-> add book");
            System.out.println("2-> list book");
            System.out.println("3-> search book");
            System.out.print("= ");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    book.add();
                }
                case 2 -> {
                    book.list();
                }
                case 3 -> {
                    book.search();
                }
            }


        }
    }
}
