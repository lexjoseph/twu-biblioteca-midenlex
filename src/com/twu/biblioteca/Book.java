package com.twu.biblioteca;


public class Book extends Item{


    //book constructor
    public Book(){
    }

    //book constructor
    Book(String title, String name, String year){
        this.title = title;
        this.name = name;
        this.year = year;
        this.available = true;
    }


}
