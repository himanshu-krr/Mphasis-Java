package Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Iteratorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    // Get the iterator
	    Iterator<String> it = cars.iterator();

	    // Print the first item
//	    System.out.println(it.next());
	    
	   // Loop through a collection
	    while(it.hasNext()) {
	      System.out.println(it.next());
	    }
	}

}
