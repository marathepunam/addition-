package javaDemo;

import java.util.Scanner;

public class While_number 
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		
		while((n =sc.nextInt()) != 0)
		{
			System.out.println("You entered " + n);
			System.out.println("Enter the next number");
		}
			System.out.println("Out of loop");
			sc.close();

	}

}
