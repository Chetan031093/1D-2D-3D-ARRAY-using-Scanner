// java programme on 2 Dimensional array using Scanner.

import java.util.Scanner;

public class Scanner_2D 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter row size : ");
		int row = scan.nextInt();
		
		System.out.println("Enter column size : ");
		int column = scan.nextInt();
		
		int arr[][] = new int[row][column];
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
