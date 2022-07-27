package javaDemo;

import java.util.Scanner;

public class Nested_If
{

	public static void main(String[] args)
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of person");
	    age=sc.nextInt();
	    if(age<=50)
	    {
	    	
	    		if(age>=18)
	    		{
	    			System.out.println("Person is eligible for license");
	    		}
	    		else
	    		{
	    			System.out.println("you are minor so you are not eligible for license");
	    		}
	    }
	    else
	    {
	    	System.out.println("you are senior citizen so you are not eligible for license");
	    }
	    sc.close();

	}

}
