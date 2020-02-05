package com.company;

public class MyClass {

        int age ;
        String name;
        String country = "Kenya";
    //    constructors initialize objects, assign values to attributes/fields.
        public MyClass(int theage,String thename){
       age = theage;
       name = thename;
    }

public void myPublicMethod(){
    System.out.println("I am a pulic method from the MyClass() object");
}
static void myStaticMethod(){
    System.out.println("I am a static method from the MyClass() object");
}
public void callmystaticmethod(){
            myStaticMethod();
}
public void getdetails(){
    System.out.println("AGE "+ age + " " + "NAME " + name );
}
public String getCountry(){
     return country;
}
}
