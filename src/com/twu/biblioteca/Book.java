package com.twu.biblioteca;

import java.util.*;



public class Book {

    private String title;
    private String authorName;
    private String bookYear;


    //book constructor
    public Book(){
    }

    //book constructor
    Book(String title, String authorName, String bookYear){
        this.title = title;
        this.authorName = authorName;
        this.bookYear = bookYear;
    }

    public String getBook(){ //change the formatting issue
        String book = (String.format("%-15s",title) + " | " + String.format("%-15s", authorName) + " | " + String.format("%-4s", bookYear) + "\n");
        return book;
    }

}
