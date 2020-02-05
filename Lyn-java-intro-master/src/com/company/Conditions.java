package com.company;

public class Conditions {
    public static void main(String[] args) {
//        condtions make use of Logical and comparison ops
//        1.if
//        2.if...else
//        3.if...else if....else...
//        4.switch

        int x = 10;
        int y = 5;
//        1.if
//        syntax:
//        if(condition){}

        if(x > y ){
            System.out.println("x is greater than y");
        }

//        if...else
        if(y > x){
            System.out.println("y is greater than x");
        }else{
            System.out.println("y is not greater than x");
        }

//        if...else if ... else
        if(y > x){
            System.out.println("y is greater than x");
        }else if(y < 10){
            System.out.println("y is less than 10");
        }else{
            System.out.println("I will run if above condtion are false");
        }
//        Next class
//        Switch
//        while loop
//        for Loop
//        Arrays






















    }
}
