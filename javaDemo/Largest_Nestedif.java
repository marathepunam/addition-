package javaDemo;

import java.util.Scanner;

public class Largest_Nestedif
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		if(a!=b)
		{
			if(a>b)
			{
			System.out.println(a+ " is largest value");
			}
			else
			{
				System.out.println(b+ " is largest value");
			}
		}
		else
		{
			System.out.println("both numbers are eqal");
		}
		sc.close();

	}

}
