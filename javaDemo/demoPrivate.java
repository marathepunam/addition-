package javaDemo;

class demo
{  
	private int i=40;  
	private void msg()
	{
	System.out.println("Hello java");
	}  
}  

public class demoPrivate
{

	public static void main(String[] args) 
	{
		demo obj=new demo();  
		   System.out.println(obj.i);//Compile Time Error  
		   obj.msg();//Compile Time Error  	   
	}

}
