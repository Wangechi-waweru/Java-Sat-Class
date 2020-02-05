package Encapsulation;

public class Person {
/*   Encapsulation makes sensitive data hidden from other classes or users.
To achieve Encapsulation:
1. Declare a class as private.
2.Provide  a public get and set methods to access and update the values of a private variable.
 */
private String name = "John Doe";
private int age = 18;

//getter method
    public String getName(){
//        returns the private name
//        this refers to the current instance of the class.
        return name;
    }
    public void setName(String newName){
//        Changes the value of the existing name.
        this.name = newName;

    }
}

class MyMain{
    public static void main(String [] args){
//        Create an object of the Person class.
        Person p1 = new Person();
        String theName = p1.getName();

}
}