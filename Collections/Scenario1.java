package Collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;


public class Scenario1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<>();
		System.out.println("Enter 10 numbers");
		for(int i = 0; i<10;i++)
		{
			ar.add(sc.nextInt());
		}
		
		int max = Collections.max(ar);
		int min = Collections.min(ar);
		float avg = (max + min)/2;
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);
	}

}
