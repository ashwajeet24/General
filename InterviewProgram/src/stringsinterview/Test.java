package stringsinterview;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test 
{

	public static void main(String[] args) 
	{
		String name="aaabbcccdddd";
		findsubs(name);
		
	}
	
	public static void findsubs(String val)
	{
		Set<String> pali = new HashSet<>();
		for(int i=0;i<val.length();i++)
		{
			pali.addAll(findpali(val,i,i));
			pali.addAll(findpali(val,i,i+1));
			
		}
		System.out.println(pali.toString());
		String min =pali.iterator().next();
		String max = pali.iterator().next();
		for(String s:pali)
		{
			if(s.length()>max.length())
			{
				max =s;
			}
			if(s.length()<min.length())
			{
				min =s;
			}
		}
			System.out.println("Maximum Palindrome substring:"+ max);
			System.out.println("Minimum Palindrome substring:"+ min);
	}
	
	public static Set<String> findpali(String a,int low,int high)
	{
		Set<String> res = new HashSet<>();
		while(low>=0&&high<a.length()&&a.charAt(low)==a.charAt(high))
		{
			res.add(a.substring(low, high+1));
			low--;
			high++;
		}
		return res;
	}

}
