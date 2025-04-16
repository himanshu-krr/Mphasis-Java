package Collections2;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Accessing values
        System.out.println("Banana Count: " + map.get("Banana"));

        // Checking if a key exists
        System.out.println("Contains Apple? " + map.containsKey("Apple"));

        // Iterating over keys
        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
