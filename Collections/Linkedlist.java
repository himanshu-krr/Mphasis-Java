package Collections;

import java.util.LinkedList;
import java.util.Iterator;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    Iterator it = cars.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }

	}

}
