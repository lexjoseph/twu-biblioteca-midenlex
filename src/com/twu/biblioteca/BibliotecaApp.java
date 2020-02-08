package com.twu.biblioteca;


import java.util.*;

public class BibliotecaApp {

    ArrayList<Book> books = new ArrayList<Book>();

    Scanner sc = new Scanner(System.in);


    public void populateBooks() {
        books.add(new Book("fire", "lex", "1994"));
        books.add(new Book("gintama", "john", "2000"));
        books.add(new Book("bleach", "ichigo", "1998"));
        books.add(new Book("Moby", "Steve", "2005"));
        books.add(new Book("My hero", "Deku", "2010"));
        books.add(new Book("Tokyo", "Shawn", "2011"));
    }

    public static void displayMenu() {
        System.out.println("Enter 1: To show a list of all books");
        System.out.println("Enter 2: To show the available books");
        System.out.println("Enter 3: To checkout a book");
        System.out.println("Enter 4: To check in a book");
        System.out.println("Enter 0: To quit");
        System.out.println();
    }

    public ArrayList<Book> getAvailableBooks() {
        return books;
    }

    public void showBooks(){
        for (Book elements: books){
            System.out.print(elements.getBook());
        }
        System.out.println();
    }

    public void showAvailable() {
        for(Book element: books){
            if(element.getAvailable()){
                System.out.print(element.getBook());
            }
        }
        System.out.println();
    }

    public void checkoutBook() {
        System.out.println("Please enter book title to check out\n");
        sc.nextLine();
        String booktitle = sc.nextLine();

        for(Book element: books){
            if(element.getBookTitle().equals(booktitle)) {
                //books.remove(element);
                element.setAvailable(false);
                System.out.println("Thank you! Enjoy the book\n");
                return;
            }
        }
        System.out.println("Sorry, that book is not available\n");
    }

    public void checkIn (){
        System.out.println("Please enter book title to check in\n");
        sc.nextLine();
        String booktitle = sc.nextLine();

        for (Book element: books){
            if(element.getBookTitle().equals(booktitle) && element.getAvailable() == false){
                element.setAvailable(true);
                System.out.println("Thank you for returning the book\n");
                return;
            }
        }
        System.out.println("That is not a valid book to return.\n");
    }


    public static void main(String[] args) {

        BibliotecaApp app = new BibliotecaApp();
        app.populateBooks();

        int choice = 0;

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n\n");

        while (true) {

            displayMenu();
            boolean check = false;

            while (!check) {
                try {
                    choice = app.sc.nextInt();
                    if (choice == 0 || choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                        check = true;
                    } else
                        System.out.println("Please select a valid option!");
                } catch (InputMismatchException e) {
                    System.out.println("Please select a valid option!");
                    app.sc.next();
                    check = false;
                }
            }

            switch (choice) {
                case 1:
                    app.showBooks();
                    break;

                case 2:
                    app.showAvailable();
                    break;

                case 3:
                    app.checkoutBook();
                    break;

                case 4:
                    app.checkIn();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }

}
