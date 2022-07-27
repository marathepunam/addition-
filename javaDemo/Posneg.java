package javaDemo;

import java.util.Scanner;

public class Posneg
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		if(n!=0)
		{
			if(n>0)
			{
				System.out.println("The number is positive ");
			} 
			else
			{
				System.out.println("The number is negative");
			}
		}
		else
		{
			System.out.println("0 is neutral number");
		}
		sc.close();

	}

}
