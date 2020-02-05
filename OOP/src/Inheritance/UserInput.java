package Inheritance;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

//        Instructions to the user
        System.out.println("Please Enter Age");
//        Store the entered name
        int age = obj.nextInt();
//        Print the name.
        System.out.println("Your age is: " + age);
        System.out.println("bye");

        Parent dad = new Parent();
        Child john = new Child(age);
        System.out.println(john.age);
        System.out.println(john.last_name);

    }
}




