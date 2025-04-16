package Collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;


public class Scenario2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ar = new ArrayList<>();
		System.out.println("Enter 6 Indian cities");
		for(int i = 0; i<6;i++)
		{
			ar.add(sc.nextLine());
		}
		
		if(ar.contains("kolkata"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("Absent");
		}

	}

}
