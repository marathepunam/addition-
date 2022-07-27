package javaDemo;

import java.util.Scanner;

public class Calculatorswitch
{

	public static void main(String[] args) 
	{
		int a,b,c;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("*****Calculator*****");
		System.out.println("press\n 1. Addition \n 2.subtraction \n 3. Multiplication \n 4. Division \n 5. Modulus");
		System.out.println("Enter your choice");

		ch=sc.nextInt();
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		switch(ch)
		{
		
		case 1: 
			c=a+b;
			System.out.println("Addition =" +c);
			break;
		case 2:
			
			System.out.println("Subtraction =" +(a-b));
			break;
		case 3:
			
			System.out.println("multiplication is = " +(a*b));
			break;
		case 4: 
			System.out.println("division is = " +(a/b));
			break;
		case 5:
			System.out.println("modulus is = " +(a%b));
			break;
			
		default:
			System.out.println("Invalid choice");
		}

	sc.close();
	}

}
