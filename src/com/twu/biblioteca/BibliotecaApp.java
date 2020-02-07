package com.twu.biblioteca;


import java.util.*;

public class BibliotecaApp {

    public static void displayMenu() {
        System.out.println("Enter 1: To show a list of books");
        System.out.println("Enter 2: To checkout a book");
        System.out.println("Enter 0: To quit");
        System.out.println();
    }

    /*public static void checkout(String bookname) {

    }*/

    public static void main(String[] args) {

        ArrayList<Book> book = new ArrayList<Book>();

        book.add(new Book("fire", "lex", "1994"));
        book.add(new Book("gintama", "john", "2000"));
        book.add(new Book("bleach", "ichigo", "1998"));
        book.add(new Book("Moby", "Steve", "2005"));
        book.add(new Book("My hero", "Deku", "2010"));
        book.add(new Book("Tokyo", "Shawn", "2011"));

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean run = false;

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n\n");

        //System.out.println(book.ge);

        while (true) {

            displayMenu();
            boolean check = false;

            while (!check) {
                try {
                    choice = sc.nextInt();
                    if (choice == 0 || choice == 1 || choice == 2) {
                        check = true;
                    } else
                        System.out.println("Please select a valid option!");
                    continue;
                } catch (InputMismatchException e) {
                    System.out.println("Please select a valid option!");
                    sc.next();
                    check = false;
                }
            }

            switch (choice) {
                case 1:
                    for (Book element : book) {
                        System.out.print(element.getBook());
                    }
                    System.out.println();
                    break;
                case 2: /////////////////////////------ Make this a function-------/////////////////////
                    System.out.println("Please enter book title to check out\n");
                    sc.nextLine();
                    String booktitle;
                    booktitle = sc.nextLine();

                    for(Book element: book){
                        if(element.getBookTitle().equals(booktitle)){
                            book.remove(element);
                            System.out.println("Thank you! Enjoy the book");
                            break;
                        }
                    }
                    System.out.println("Sorry, that book is not available\n");
                    break;
//////////////////////////////////////////////////////////////////////////////////////////////
                case 0:
                    java.lang.System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
