package ArrayList;
//The is a resizeable array.
//To use it you must import it from java.utils package
import java.util.ArrayList;//You must import.
public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
//        Addind Data into the ArrayList: use add()
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Guava");
        System.out.println(fruits);

//        Accessing items in an ArrayList: use get()
        String item0 = fruits.get(0);
        String item1 = fruits.get(1);
        String item2 = fruits.get(2);
//        Print results
        System.out.println(item0);
        System.out.println(item1);
        System.out.println(item2);

//        Changing items in an array: use set()
        fruits.set(0, "Avocado");
        System.out.println(fruits);

//        Removing an item in an ArrayList: use remove()
        fruits.remove(2);
        System.out.println(fruits);

//        Removing every data in an ArrayList: use clear()
//        fruits.clear();
//        System.out.println(fruits);

//        Array length: use size()
        int count = fruits.size();
        System.out.println(count);

//        Looping through an array list.
        for (int i = 0; i < count; i++) {
            System.out.println(fruits.get(i));
        }
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

//        looping using a for each loop
        for (String matunda: fruits){
            System.out.println(matunda);
        }
//        Array of other Datatypes
        ArrayList<Integer>ages = new ArrayList<Integer>();
        ages.add(23);
        ages.add(24);
        ages.add(25);
        System.out.println(ages);
//        Assignment research on collections.
    }
}
