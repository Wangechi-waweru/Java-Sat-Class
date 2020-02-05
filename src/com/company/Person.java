package com.company;

public class Person {

    private String name = "John";
    private String country = "Kenya";
    private int salary = 500000;
    public String language = "Java";

//    getter
//    public String getName(){
//        return name;
//    }
//    setter
//    public String setName (String theName){
//        this.name = theName;
//        return this.name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
