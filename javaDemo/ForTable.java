package javaDemo;

import java.util.Scanner;

public class ForTable
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for which you need to print table ");
		int a=sc.nextInt();
		System.out.println("Table of " +a);
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(a+" X "+i+" = "+(a*i));
		}
		sc.close();
	}

}
