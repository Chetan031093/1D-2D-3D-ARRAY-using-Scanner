import java.util.Scanner;

public class Scanner_1D 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter row size :");
		int row = scan.nextInt();
		
		int arr[] = new int[row];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
