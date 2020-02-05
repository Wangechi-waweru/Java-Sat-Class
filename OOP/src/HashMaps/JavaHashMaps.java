package HashMaps;

import java.util.HashMap;

//    Unlike Arrays and ArraysList, HashMaps Store data in keys: value pairs.
//    To use HashMaps, you must import them.
public class JavaHashMaps {
    public static void main(String[] args) {
        HashMap<String, String> person = new HashMap<String, String>();
//        Adding data into a Hashmap
        person.put("Name", "John Doe");
        person.put("Country", "Kenya");
        person.put("Career", "Google Software Engineer");
        person.put("Color", "Dark");
        System.out.println(person);

//        Accessing HashMap Values: use get()
        String name = person.get("Name");
        System.out.println(name);

//        Removing an item in a hashmap: use remove();
        person.remove("Color");
        System.out.println(person);

//        To print out the keys: use keyset()
        System.out.println(person.keySet());

//        To print out the values: use values()
        System.out.println(person.values());

//        Loop keys
        for(String k: person.keySet()){
            System.out.println(k);
        }

//        Loop values
        for (String v: person.values()){
            System.out.println(v);
        }

    HashMap<String, Integer> students = new HashMap<String, Integer>();
     students.put("John", 23);
     students.put("Mary", 43);
     students.put("Bob", 13);
     students.put("Mike", 45);
        System.out.println(students);


    }

}
