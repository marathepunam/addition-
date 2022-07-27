package javaDemo;

import java.util.Scanner;

public class Switchdays 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*****Days of Week*****");
		System.out.println("Enter the name of the day");
		String ch=sc.nextLine();
		switch(ch)
		{
		case "Sunday":
			System.out.println("It is first day in a week");
			break;
		case "Monday":
			System.out.println("It is second day in a week");
			break;
		case "Tuesday":
			System.out.println("It is third day in a week");
			break;
		case "Wednesday":
			System.out.println("It is fourth day in a week");
			break;
		case "Thursday":
			System.out.println("It is fifth day in a week");
			break;
		case "Friday":
			System.out.println("It is sixth day in a week");
			break;
		case "Saturday":
			System.out.println("It is seventh day in a week");
			break;	
		default:
			System.out.println("Invalid day");
		}
		sc.close();

	}

}
