package stringsinterview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class TestonStrings 
{
	public static void strOcc(String name)
	{	
		int maxOcc=0;
		int minOcc=0;
		String val =name.toLowerCase();
		char[] ch = val.toCharArray();
		HashMap<Character,Integer> charMap = new HashMap<>();
		for(char c:ch)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
			}
			else
			{
				charMap.put(c, 1);
			}
		}
		
		maxOcc=Collections.max(charMap.values());
		minOcc =Collections.min(charMap.values());
		
		char max=Character.MAX_VALUE;
		char min =Character.MIN_VALUE;
		
		for(Entry<Character,Integer>entry:charMap.entrySet())
		{
			if(entry.getValue()==maxOcc)
			{
				max =entry.getKey();
				maxOcc=entry.getValue();
			}
			if(entry.getValue()==minOcc)
			{
				min =entry.getKey();
				minOcc =entry.getValue();
			}
		}
		
		System.out.println("Max character is: "+ max +": "+maxOcc);
		System.out.println("Min Character is :"+ min+":"+minOcc);
	}
}
