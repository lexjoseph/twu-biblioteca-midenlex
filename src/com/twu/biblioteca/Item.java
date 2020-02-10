package com.twu.biblioteca;

abstract class Item {

    protected String title;
    protected String name;
    protected String year;
    protected boolean available;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getItem() {
        String book = (String.format("%-15s",title) + " | " + String.format("%-15s", name) + " | " + String.format("%-4s", year) + "\n");
        return book;
    }
}
