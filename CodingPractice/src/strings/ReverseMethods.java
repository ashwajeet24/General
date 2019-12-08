package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseMethods {

	public static String reverse(String s)
	{
		String rev ="";
		int n =s.length();
		//System.out.println(n);
		for(int i=s.length()-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
		return rev ;
	}
	
	
	public static void testpali(String s)
	{
		reverse(s);
		if(s.equals(reverse(s)))
		{
			System.out.println("Its is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
	public static void main(String[] args) 
	{			
			String n= "Ashwajeet";
			String a = n.toLowerCase();
			String test= "malayalam";
			System.out.println(reverse(a));
			testpali(test);
			testpali(a);
			
			int[] number = {12,22,3,4,55};
			Arrays.sort(number);
			System.out.println(Arrays.toString(number));
			int sec = number[number.length-2];
			System.out.println(sec);
			char[] c =a.toCharArray();
			Arrays.sort(c);
			System.out.println(Arrays.toString(c));
	}

}
