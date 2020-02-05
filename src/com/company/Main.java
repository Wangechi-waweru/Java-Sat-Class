package com.company;


public class Main {


//    Method creation/ declaration

    static void myMethod(){
        System.out.println("I am a static method");
    }

    public static void main(String[] args) { //method

        final float p = 3.142f;


       MyClass myobj = new MyClass(50,"John");
        System.out.println(myobj.age + " " + myobj.name + " " + myobj.country);
        System.out.println(myobj.country);
        myobj.country = "Niger";
        System.out.println(myobj.country);

//        calling the myMethod
        myMethod();
        myobj.myPublicMethod();
        myobj.callmystaticmethod();
        myobj.getdetails();
        String theCountry = myobj.getCountry();
        System.out.println(theCountry);

        Person person1 = new Person();
        String theName = person1.getName();
        System.out.println(theName);
        person1.setName("Victor");
        String newName = person1.getName();
        System.out.println(newName);
    }
}





