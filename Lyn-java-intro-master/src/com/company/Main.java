package com.company;

public class Main {

    public static void main(String[] args) {
    //	echo "Helo world";
    //  Java is a case sensitive: system is not the same as System
	System.out.println("Hello world");
        System.out.println("Hello again");
        //Java variable type: String, int, float,char, boolean
        //String variable
        String name = "John";
        System.out.println("name");
        System.out.println(name);
        //integer varibale
        int age = 12;
        System.out.println(age);
        //float variable
        float height = 12.43f;
        System.out.println(height);
        //Boolean:
        boolean isTall = true;
        //Character variable
        char letter = 'A';
        System.out.println(letter);

//        concatenation
//        $x = "john";
//        $y = "Doe";
        String x = "John";
        String y = "Doe";
        System.out.println(x +" "+ y);

        System.out.println("Hello "+ x +" " + y);
//        declaring/intantiating empty variables
        String username,email,password;
//        assigning multiple variables at the same time
        int a = 10, b =20, c= 30;

        x = "Mary";
        System.out.println(x);
//        constant variables
        final String country = "Kenya";
        System.out.println(country);

//        General rules that for varible names
//        1.can contain letter, digits, umderscore and dollar sign
//        String name_, String name$
//        2.Must begin with a letter
//        3.should start with lowercase and cannot contain white space
        System.out.println(3 + 4);
        int sum = 3+4;
        System.out.println(sum);
//        TsT5TZl0



//
//datatype
//type casting
//operators
//Strings
//        Datatypes in Java
//        Primitive and Non-repimitive
//        Primitive datattype:Specifies the type and size of the variable values:
//        byte, short,int, long,float, double, boolean,char
//        Non- primitive: String,Arrays, classes
//
//        Casting datatypes:
//        widening casting :convertion from small to large
//        narrowing casting: converting from large to smalle
//
//widening casting:
        int myage = 23;
        double agedouble = myage;
        System.out.println(myage);
        System.out.println(agedouble);

//narrowing casting
        int intAge = (int) agedouble;
        System.out.println(intAge);











    }
}
