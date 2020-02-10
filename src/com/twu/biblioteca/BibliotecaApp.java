package com.twu.biblioteca;


import java.util.*;

public class BibliotecaApp {

    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Movie> movies = new ArrayList<Movie>();
    Scanner sc = new Scanner(System.in);

    public void populateBooks() {
        books.add(new Book("fire", "lex", "1994"));
        books.add(new Book("gintama", "john", "2000"));
        books.add(new Book("bleach", "ichigo", "1998"));
        books.add(new Book("Moby", "Steve", "2005"));
        books.add(new Book("My hero", "Deku", "2010"));
        books.add(new Book("Tokyo", "Shawn", "2011"));
    }

    public void populateMovies(){
        movies.add(new Movie("Bad Boys 3", "2020", "Lex", "9.9"));
        movies.add(new Movie("Fast 5", "2018", "Midenlex", "9.1"));
        movies.add(new Movie("Tag", "2014", "Someone", "8.7"));
    }

    public void displayMenu() {
        System.out.println("Enter 1: To show a list of all books");
        System.out.println("Enter 2: To show the available books");
        System.out.println("Enter 3: To checkout a book");
        System.out.println("Enter 4: To check in a book");
        System.out.println("Enter 5: To show a list of all movies");
        System.out.println("Enter 6: To show the available movies");
        System.out.println("Enter 7: To checkout a movie");
        System.out.println("Enter 8: To check in a movie");
        System.out.println("Enter 0: To quit");
        System.out.println();
    }

    public ArrayList<Book> getAvailableBooks() {
        return books;
    }

    /*---------------------------------*/
    public void showItemsB(){
        for (Book elements: books){
            System.out.print(elements.getItem());
        }
        System.out.println();
    }

    public void showItemsM(){
        for (Movie elements: movies){
            System.out.print(elements.getItem());
        }
        System.out.println();
    }
    /*======================================*/

    /*--------------------------------------*/
    public void showAvailableB() {
        for(Book element: books){
            if(element.getAvailable()){
                System.out.print(element.getItem());
            }
        }
        System.out.println();
    }

    public void showAvailableM() {
        for(Movie element: movies){
            if(element.getAvailable()){
                System.out.print(element.getItem());
            }
        }
        System.out.println();
    }
    /*=======================================*/

    /*--------------------------------------*/
    public void checkoutB() {
        System.out.println("Please enter book title to check out\n");
        sc.nextLine();
        String booktitle = sc.nextLine();

        for(Book element: books){
            if(element.getTitle().equals(booktitle) && element.getAvailable()) {
                //books.remove(element);
                element.setAvailable(false);
                System.out.println("Thank you! Enjoy the book\n");
                return;
            }
        }
        System.out.println("Sorry, that book is not available\n");
    }

    public void checkoutM() {
        System.out.println("Please enter Movie title to check out\n");
        sc.nextLine();
        String booktitle = sc.nextLine();

        for(Movie element: movies){
            if(element.getTitle().equals(booktitle) && element.getAvailable()) {
                //books.remove(element);
                element.setAvailable(false);
                System.out.println("Thank you! Enjoy the movie\n");
                return;
            }
        }
        System.out.println("Sorry, that movie is not available\n");
    }
    /*=======================================*/

    /*---------------------------------------*/
    public void checkInB(){
        System.out.println("Please enter book title to check in\n");
        sc.nextLine();
        String booktitle = sc.nextLine();

        for (Book element: books){
            if(element.getTitle().equals(booktitle) && element.getAvailable() == false){
                element.setAvailable(true);
                System.out.println("Thank you for returning the book\n");
                return;
            }
        }
        System.out.println("That is not a valid book to return.\n");
    }

    public void checkInM(){
        System.out.println("Please enter movie title to check in\n");
        sc.nextLine();
        String booktitle = sc.nextLine();

        for (Movie element: movies){
            if(element.getTitle().equals(booktitle) && element.getAvailable() == false){
                element.setAvailable(true);
                System.out.println("Thank you for returning the movie\n");
                return;
            }
        }
        System.out.println("That is not a valid movie to return.\n");
    }
    /*============================================*/

    public static void main(String[] args) {

        BibliotecaApp app = new BibliotecaApp();
        app.populateBooks();
        app.populateMovies();

        int choice = 0;

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n\n");

        while (true) {

            app.displayMenu();
            boolean check = false;

            while (!check) {
                try {
                    choice = app.sc.nextInt();
                    if (choice == 0 || choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice ==5 ||
                            choice ==6 || choice ==7 || choice ==8) {
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
                    //item = new Book();
                    app.showItemsB();
                    break;

                case 2:
                    app.showAvailableB();
                    break;

                case 3:
                    app.checkoutB();
                    break;

                case 4:
                    app.checkInB();
                    break;

                case 5:
                    //item = new Movie();
                    app.showItemsM();
                    break;

                case 6:
                    app.showAvailableM();
                    break;

                case 7:
                    app.checkoutM();
                    break;

                case 8:
                    app.checkInM();
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
