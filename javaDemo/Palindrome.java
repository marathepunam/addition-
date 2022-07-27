package javaDemo;

import java.util.Scanner;

public class Palindrome
{

	public static void main(String[] args) 
	{
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=0, temp=0,p;
		p=num;
		//reverse integer is stored in variable
		while(num !=0)
		{
			temp= num % 10;
			rev= rev * 10 + temp;
			num = num / 10;
		}
		System.out.println("Reverse number is" +rev);
		//palindrome if original integer or number and reverse number is equal.
		if(p == rev)
		{
			System.out.println(p+ " is a palindrom number");
		}
		else
		{
			System.out.println(p+ " is not palindrom number");
		}
		sc.close();

	}

}
