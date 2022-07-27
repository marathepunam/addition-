package javaDemo;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for printing factorial");
		int num=sc.nextInt();
		long fact = 1;
		for(int i = 1;i <= num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of " +num+ "is: " +fact);
		sc.close();

	}

}
