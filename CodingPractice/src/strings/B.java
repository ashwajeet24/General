package strings;

import java.util.ArrayList;

public class B 
{
	

public static void main(String[] args)
	{
	ArrayList<Integer> a =new ArrayList<Integer>();
	a.add(12);
	a.add(23);
	a.add(34);
	ArrayList<Integer> c = new ArrayList<Integer>();
	c.addAll(a);
	System.out.println(a.toString());
	
	a.add(1,22);
	System.out.println(a.toString());
	a.clear();
	System.out.println(a.toString());
	a.addAll(c);
	System.out.println(a.toString());
	System.out.println(a.get(1));
	
	}
}
