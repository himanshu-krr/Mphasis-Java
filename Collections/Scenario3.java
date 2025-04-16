package Collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;


public class Scenario3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> city = new ArrayList<>();
		System.out.println("Enter 5 Indian cities");
		for(int i = 0; i<5;i++)
		{
			city.add(sc.nextLine());
		}
		ArrayList<String> state = new ArrayList<>();
		System.out.println("Enter 5 Indian cities");
		for(int i = 0; i<5;i++)
		{
			state.add(sc.nextLine());
		}
		
		ArrayList<String> cl = new ArrayList<>();
        cl.addAll(city);
        cl.addAll(state);
        
     
        Collections.sort(cl);
        
        
        System.out.println("Sorted list of cities and states:");
        for (String i : cl) {
            System.out.println(i);
        }


	}

}
