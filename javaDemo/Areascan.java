package javaDemo;

import java.util.Scanner;

public class Areascan 
{
	public static void main(String[] args) 
	{
		int r;
		double pi=3.14,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of radius");
		r=sc.nextInt();
		area=pi*r*r;
		System.out.println("Area of circle is "+area +"sqcm");
		sc.close();

	}

}
