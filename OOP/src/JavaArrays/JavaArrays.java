package JavaArrays;

public class JavaArrays {
    /* Arrays: a way of storing data in java
    e.g lists: shopping lists
     To create an array, you must specify the type of data that the array will store.*/

//    Creating an empty array
public static void main(String[] args) {
    String[] cars; //Empty array
    cars = new String[]{"Benz ", "BMW ","Ford" };
    var names = new String[]{"John","Mary","Paul"};
    int[] ages = {12, 34,65,34,43};

//    Indexing items in arrays.
    System.out.println(cars[0]);
    System.out.println(cars[1]);
    System.out.println(ages[0]);
    System.out.println(ages[1]);

//    Changing values
    cars[0] = "Audi";
    System.out.println(cars[0]);

//    finding length/ number of items in an array.
    int count = cars.length;
    System.out.println(count);

//looping through an array.
    for(int i = 0; i < count; i++){
        System.out.println(cars[i]);
    }
}

}
