package Collections;

//In Java, <Integer> typically appears in the context of generics, which allow for type safety and flexibility when working with collections and other generic classes.
//
//For example, when you use List<Integer>, you're creating a list that can store only Integer objects (the wrapper class, not primitive int). This is useful because:
//
//It ensures type safety (you can't accidentally add a non-integer).
//
//It allows you to use Integer's built-in methods.
//
//It integrates seamlessly with Java's Collections Framework.

import java.util.ArrayList;

public class Arraylist {
	

	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>(); // Creating an ArrayList
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");

	        System.out.println(list); // Output: [Apple, Banana, Cherry]
	        
	        
	        ArrayList al = new ArrayList();
	        al.add(100);
	        al.add("Susil");
	        
	        System.out.println(al);
	    }
	}



