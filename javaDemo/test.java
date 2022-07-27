package javaDemo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
class Mobile{

    String mname ="Nokia";

}

class Processor extends Mobile{

    String pname = "Snapdragon";

}

class Device extends Processor{

    String dname = "Android";

}


public class test 
{

	public static void main(String[] args) 
	{
		Processor p = new Processor();

       // System.out.println(p.dname);
       System.out.println(p.pname); 
	}
}


