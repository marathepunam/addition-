package javaDemo;

import java.util.Scanner;

public class Perimeterscan 
{

	public static void main(String[] args) 
	{
		int a,b,c,peri;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of side 1");
		a=sc.nextInt();
		System.out.println("Enter value of side 2");
		b=sc.nextInt();
		System.out.println("Enter value of side 3");
		c=sc.nextInt();
		peri=a+b+c;
		System.out.println("Perimeter of triangle is "+peri);
		sc.close();
	}

}
