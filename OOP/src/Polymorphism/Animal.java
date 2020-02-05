package Polymorphism;
/*Polymorphism means many forms.
Occurs when we have many classes that are related to each other by inheritance.
 Inheritance lets us inherit attributes and methods, polymorphism uses those methods to perform different tasks.
 Hence, polymorphism allows us to perform a single action in different ways.*/

public class Animal {//    Parent class
   public void animalSound(){
       System.out.println("The animal makes a funny sound");
   }
}
class Dog extends Animal{//    child class
    public void animalSound() {
        System.out.println("Woof woof");
    }
    public void coatColor(){
        System.out.println("Brown dog");
    }
}
class Horse extends Animal{
    public void animalSound(){
        System.out.println("I neigh");
    }
}


class MainClass{
    public static void main(String[] args) {
//        create objects
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myHorse =  new Horse();
        myAnimal.animalSound();
        myDog.animalSound();
        myHorse.animalSound();
    }
}