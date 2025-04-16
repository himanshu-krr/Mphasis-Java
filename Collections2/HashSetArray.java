package Collections2;


import java.util.HashSet;

public class HashSetArray {
    public static void main(String[] args) {

        String[] fruitsArray = {"Apple", "Banana", "Orange", "Grapes", "Apple"}; // Input array

        HashSet<String> set = new HashSet<>();

        // Adding elements from the array into the HashSet
        for (String fruit : fruitsArray) {
            set.add(fruit);
        }

        // Printing the HashSet
        System.out.println("HashSet content: " + set);

        // Checking if "Banana" exists in the set
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Removing "Orange" from the set
        set.remove("Orange");

        // Printing the elements of the set after removal
        System.out.println("After Removing:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}

