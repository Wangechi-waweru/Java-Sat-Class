package Inheritance;

public class Animal {
    public String name = "Anime";
    public String country= "Malawi";
    private int Price = 309000;

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void getDetails(){
        System.out.println(name);
        System.out.println(country);

    }
}

class Dog extends Animal{
    String Owner;
    public Dog (String myOwner){
        Owner = myOwner;
    }
}
class Pig extends Animal{
    int weight;
    public Pig (int myWeight){
        weight = myWeight;
    }
}
class myAnimal{
    public static void main(String[] args) {
       Dog dog1 = new Dog("Steve");
       Pig pig1 = new Pig(150);

        System.out.println(dog1.Owner);
        System.out.println(pig1.weight);

        int prices = dog1.getPrice();
        System.out.println(prices);

        System.out.println(dog1.name);
        System.out.println(dog1.country);

        System.out.println(pig1.name);
        System.out.println(pig1.country);

        System.out.println("I am a dog. My owner is " + dog1.Owner + " from " + dog1.country + ".");
    }
}