package javaDemo;

import java.util.Scanner;

public class If 
{
	public static void main(String[] args) 
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of person");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Person is Adult");
			
		}
		else
		{
			System.out.println("Person is minor");
		}
		sc.close();
}

}
