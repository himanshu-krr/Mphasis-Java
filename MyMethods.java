import java.util.Scanner;
public class MyMethods {
    // A sample method
    public int addNumbers(int a, int b) {
        return a + b;
    }
    
    public int subNumbers(int a, int b) {
        return a - b;
    }
    
    public int[] inputArr(int n)
    {
    	Scanner sc = new Scanner(System.in);
    	int[] arr = new int[n];
		for ( int i= 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
    }
}
