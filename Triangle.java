package myProgram2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int n=sc.nextInt();
		
		// Create row
		for(int r=1; r<=n; r++) 
		{
			// create column
			for(int c=n; c>=1; c--)
			{
				if(c<=r)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
	
}
