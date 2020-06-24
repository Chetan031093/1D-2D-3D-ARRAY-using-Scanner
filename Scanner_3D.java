//// java programme on 3 Dimensional array using Scanner.

import java.util.Scanner;

public class Scanner_3D 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of plane :");
		int plane = scan.nextInt();
		
		System.out.println("Enter the size of row :");
		int row = scan.nextInt();
		
		System.out.println("Enter the size of column :");
		int column = scan.nextInt();
		
		int arrr[][][] = new int[plane][row][column];
		
		System.out.println(arrr[0][1][2]);
		
		for(int i = 0; i<arrr.length; i++)
		{
			for(int j = 0; j<arrr[i].length; j++)
			{
				for(int k = 0; k<arrr[i][j].length; k++)
				{
					arrr[i][j][k] = scan.nextInt();
				}
				System.out.println();
			}
			System.out.println();
		}
		
		for(int i = 0; i<arrr.length; i++)
		{
			for(int j = 0; j<arrr[i].length; j++)
			{
				for(int k = 0; k<arrr[i][j].length; k++)
				{
					System.out.print(arrr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
