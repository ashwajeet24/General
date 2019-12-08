
import java.util.Collections;
import java.util.HashSet;

import java.util.Set;

public class Substriingtest {
// find all the substring that are palindrome and then print all the permutation of the string
	public static void main(String[] args) 
	{
			String checkpali = "bbnanas";
			String another="ABC";
			System.out.println(findallsubstring(checkpali));
			findperm(another," ");
	}
	
	public static String findallsubstring(String input)
	{
		Set<String> palindrome = new HashSet<>();
		for(int i=0;i<input.length();i++)
		{
			palindrome.addAll(ifpali(input,i,i+1));
			palindrome.addAll(ifpali(input,i,i));
		}
		int maxlen=0;
		String smallest=palindrome.iterator().next();
		String largest=null;
		for(String s: palindrome)
		{
			if(maxlen<s.length())
			{
				maxlen=s.length();
				largest=s;
			}
			if(s.length()<smallest.length())
			{
				smallest =s;
			}
		}
		
		return largest+ ":" +smallest;
		
	}
	public static Set<String> ifpali(String input,int low,int high)
	{
		Set<String> result = new HashSet<>();
		while(low>=0&&high<input.length()&& input.charAt(low)==input.charAt(high))
		{
			result.add(input.substring(low,high+1));
			low--;
			high++;
		}
		return result;
	}
	
		public static void findperm(String input, String res)
		{
			if(input.length()==0)
			{
				System.out.print(res+" ");
				return;
			}
			
			for(int i=0;i<input.length();i++)
			{
				char c =input.charAt(i);
				
				String restofStr = input.substring(0, i)+input.substring(i+1);
				findperm(restofStr,res+c);
			}
		}
}
