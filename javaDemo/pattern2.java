package javaDemo;

public class pattern2
{

	public static void main(String[] args) 
	{
		
				int r=9;
				for(int i=1; i<=r; i++)
				{
					for(int j=1; j<=r-i; j++)
					{
						System.out.print(" ");			//to print spaces
					}
							
					for(int k=1; k<i; k++)
					{
						System.out.print(k);
					}
					
					for(int k=i;k>=1;k--)
					{
						System.out.print(k);
				
					}

					System.out.println();
				}
			}
		
	}


