package Collections2;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        
        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Apple"); // Duplicate, won't be added

        System.out.println(set); 

        System.out.println(set.contains("Banana"));

        System.out.println("After Removing");

        set.remove("Orange");

        for (String fruit : set) {
            System.out.println(fruit);
        }
        
        String sI = "Banana";
        boolean tof = set.contains(sI);
        
        System.out.println(tof);

        
    }
}
