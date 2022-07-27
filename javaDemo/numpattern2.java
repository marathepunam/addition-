package javaDemo;

public class numpattern2 
{

	public static void main(String[] args)
	{
		int rows = 12;
		for(int i=1; i<=rows;i++)
		{
		/*(int space=1;space<rows-i;space++)
			{
				System.out.print("");
			}*/
			for(int j= 1; j<=i;j++)
			{
				System.out.print(j);
			}
			
				System.out.println("");
			}
		for(int i=rows-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
