package javaDemo;

import java.util.Scanner;

public class Gradeladder 
{

	public static void main(String[] args) 
	{
		String name;
		double perc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		name=sc.nextLine();
		System.out.println("Enter percentage of students");
		perc=sc.nextFloat();
		
		if(perc<=100 && perc>=95)
		{
			System.out.println(name+", u got outsanding grade");
		}
		else if (perc<=94 && perc>=80)
		{
			System.out.println(name+", u got A grade");
		}
		else if (perc<=79 && perc>=70)
		{
			System.out.println(name+", u got B grade");
		}
		else if (perc<=69 && perc>=60)
		{
			System.out.println(name+", u got c grade");
		}
		else if(perc<=59 && perc>=50)
		{
			System.out.println(name+", u got D grade");
		}
		else if(perc<=49 && perc>=40)
		{
			System.out.println(name+", u got E grade");
		}
		else
		{
			System.out.println(name+", u failed");
		}
		sc.close();

	}

}
