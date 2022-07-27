package javaDemo;

import java.util.Scanner;

public class pattern 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();             
        for (int i = 1; i <= rows; i++) 
        {
            //Printing first half of the row
             
            for (int j = 1; j <= i; j++) 
            { 
                System.out.print(j+" "); 
            }
             
            //Printing second half of the row 
             
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        sc.close();
	}
	
}
