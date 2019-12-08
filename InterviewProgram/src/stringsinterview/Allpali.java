package stringsinterview;

import java.util.HashSet;
import java.util.Set;

public class Allpali {

	public static void main(String[] args) {
			String a ="AABBCCDDD";
			System.out.println(allpali(a));
	}
	
	
	public static Set<String> allpali(String in)
	{
		Set<String> supali = new HashSet<String>();
		for(int i=0;i<in.length();i++)
		{
			supali.addAll(ispali(in,i,i+1));
			supali.addAll(ispali(in,i,i ));
		}
		return supali;
		
	}
	
	public static Set<String> ispali(String a,int low, int high)
	{
		Set<String> res = new HashSet<String>();
		
		while(low>=0&&high<a.length()&&a.charAt(low)==a.charAt(high))
		{
			res.add(a.substring(low, high+1));
			low--;
			high++;
		}
		return res;
	}
}
