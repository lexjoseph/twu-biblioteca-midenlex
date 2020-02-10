package com.twu.biblioteca;

import java.util.ArrayList;

public class User {

    private String username;
    private String password;
    private String name;
    private String email;
    private String number;
    private boolean isLibrarian;


    //ArrayList<String> userbook = new ArrayList<String>();


    public User(){

    }

    User(String username, String password, String name, String email
            , String number, boolean isLib){
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.number = number;
        this.isLibrarian = isLib;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public boolean isLibrarian() {
        return isLibrarian;
    }


    public void getInfo(){
        System.out.println("Name: " + name +
                "\nEmail: " + email +
                "\nPhone number: " + number + "\n");
    }


}
