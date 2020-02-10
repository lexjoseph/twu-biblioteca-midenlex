package com.twu.biblioteca;

public class Movie extends Item {

    private String rating;

    //Movie constructor
    public Movie(){

    }

    Movie(String title, String year, String name, String rating){
        this.title = title;
        this.year = year;
        this.name = name;
        this.rating = rating;
        this.available = true;
    }

    @Override
    public String getItem(){
        String book = (String.format("%-15s",title) + " | " + String.format("%-15s", year) + " | " + String.format("%-15s", name) + " | " + String.format("%-2s", rating) + "\n");
        return book;
    }


}
