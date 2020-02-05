package InnerClass;

public class OuterClass {
    int age = 23; //Field/attribute
    int[] ages = {12, 34,65,34,43};
    String name = "John"; //Field/attribute

    public void myMethod(){ //method
        System.out.println("Outer class.");
    }
    class InnerClass{
        String country = "Chad";
    }
    static class InnerStaticClass{ //Can be accessed without creating an object of the outer class.
        String county = "Nairobi";
    }
}
class mainClass{
    public static void main(String[] args) {
//        Outer object
        OuterClass outerObject = new OuterClass();
//        inner object
        OuterClass.InnerClass innerObject =  outerObject.new InnerClass();

        outerObject.myMethod();
        System.out.println(outerObject.ages[0]);
        System.out.println(innerObject.country);

//        Calling a static class
        OuterClass.InnerStaticClass innerStaticObject = new OuterClass.InnerStaticClass();
        System.out.println(innerStaticObject.county);
    }
}