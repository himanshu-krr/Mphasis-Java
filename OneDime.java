import java.util.Arrays;
import java.util.Scanner;

public class OneDime {	
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int num : arr) {
			if(num > max)
			{
				max = num;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyMethods myMethods = new MyMethods();
		System.out.print("Enter the number of employee : ");
		int n = sc.nextInt();
		System.out.println("Enter the salary of employees");
		int[] sal = myMethods.inputArr(n);

		int sum = 0;
		for (int element : sal)
		{
			sum = sum + element;

		}
		// System.out.println("Displaying the salary at the 5th posistion " + sal[4]);
		System.out.println("Displaying the array in ascending array ");
		Arrays.sort(sal);
		for (int num : sal) {
			System.out.println(num);
		}
		double avg = 0.00;
		avg  = (double) sum / n;
		System.out.println("The average salary : " + avg);
		
		int max = findMax(sal);
		System.out.println("The maxinum salary : " + max);
		
		
		System.out.println("The minimum salary : " + sal[0]);
		
		System.out.println("Displayiing the array in descending order ");
		for (int i = n-1; i>=0; i-- )
		{
			System.out.println(sal[i]);
		}
		
		double[] gS = new double[n];
		System.out.println("Displaying after hike of 30%");
		for (int i = 0; i<n; i++)
		{
			gS[i] = sal[i] + (sal[i] * 30 / 100.0);
			System.out.println(gS[i]);
		}
		
	}

}
