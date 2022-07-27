package javaDemo;

import java.util.Scanner;

public class Largest_3digit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of first number");
		int a=sc.nextInt();
		System.out.println("Enter the value of second number");
		int b=sc.nextInt();
		System.out.println("Enter the value of third number");
		int c= sc.nextInt();
		if(a>b && a>c)
		{
			
			System.out.println(a+ "is the largest number");
		}	
		else if (b>a && b>c)
		{
			System.out.println(b+ " is the largest number");
		}
		else if (c>a && c>b)
		{
			System.out.println(c+ " is the largest number");
		}
		else
		{
		System.out.println("all 3 numbers are equal");
		}
		sc.close();


	}

}
