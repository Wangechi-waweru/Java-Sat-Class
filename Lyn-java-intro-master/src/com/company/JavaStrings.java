package com.company;

public class JavaStrings {
    public static void main(String[] args) {
//        String : a sequence of characters in between double quotes
        String name = "John";
//        method: a block of code that does something specific only when it is called
//        String length method
//
        System.out.println(name.length());//Finding number of characters in a string
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

//        concatenation/joining
        String firstname = "John";
        String lastname = "Doe";
        String fullname = firstname.toUpperCase() + " "+ lastname.toLowerCase();
        System.out.println(fullname);
    }
}
