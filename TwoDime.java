import java.util.Scanner;
public class TwoDime {

	public static void main(String[] args) {
		int arr[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<2;i++)
		{
			for(int j =0;j<2;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Displaying the 2D array");
		for(int i =0;i<2;i++)
		{
			for(int j =0;j<2;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
	}

}
