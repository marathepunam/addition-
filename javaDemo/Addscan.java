package javaDemo;

import java.util.Scanner;

public class Addscan
{

	public static void main(String[] args)
	{
		int a,b,add;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		add=a+b;
		System.out.println("Addition of two numbers is" +add);
		sc.close();
	
	}

}
