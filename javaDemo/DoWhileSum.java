package javaDemo;

import java.util.Scanner;

public class DoWhileSum
{

	public static void main(String[] args) 
	{
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		do 
		{
			System.out.println("Enter the number");
			num=sc.nextInt();
			sum=sum+num;
		}while(num !=0);
		System.out.println("sum= " + sum);
		System.out.println("Out of the loop");
		sc.close();

	}

}
