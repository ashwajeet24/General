package stringsinterview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

//jav string questions from Javapoint 
public class BasicStringQues 
{
//1 Java Program to count the total number of characters in a string
	
	public static void countstr(String s)
	{
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ');
			count++;
		}
		System.out.println("The total numbe character in a strings:"+ count);
		
	}
	public static void main(String[] args)
	{
		String name ="Ashwajeet";
		countstr(name);
		String val = "This is my way of coding.!!!!,I hpe you ,like it if not Why???";
		spclchar(val);
		String str = "This is a really simple sentence";    
		VandC(str); 
		String str1 ="aaaabbbbcccc";
		int n =3;
		nParts(str1,n);
		
		String data ="ABCD";
		subset(data,"");
		System.out.println();
		String name1="Malaaam"; 
		strOcc(name1);
		String sen ="I love madam tusads";
		System.out.println(longestPalin(sen));
	}
	
	//Java Program to count the total number of punctuation characters exists in a String
	// it can be any special character
	
	public static void spclchar(String s)
	{
		int Qcount=0;
		int Ecount =0;
		int periodcount =0;
		int commacount =0;
	
		for(int i=0;i<s.length();i++)
		{
			switch(s.charAt(i))
			{
			case '?':
					Qcount++;
					break;
			case '!':
					Ecount++;
					break;
			case '.':
					periodcount++;
			case ',':
					commacount++;
					break;
			}
		}
		System.out.println(commacount);
		System.out.println(Qcount);
		System.out.println(Ecount);
		System.out.println(periodcount);
		
		}
	
	
	// Java program to write consonant and vowels in a string 
	
	public static void VandC(String s)
	{
		int vcount =0;
		int ccount =0;
		String str =s.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			switch(str.charAt(i))
			{
			case 'a':
					vcount++;
					break;
			case 'i':
					vcount++;
					break;
			case 'e': 
					vcount++;
					break;
			case 'o': 
					vcount++;
					break;
			case 'u':
					vcount++;
					break;
			default:
				ccount++;
				break;
			}
			}
		System.out.println("Vowels: "+ vcount);
		System.out.println("Consonants: "+ ccount);
			
			
		}
		
	
	
	
	//Java Program to divide String into n equal parts

	public static void nParts(String s, int n)
	{
		int len =s.length();
		String[] newval = new String[n];
		int temp=0;
		int val =len/n;
		
		if(len%n!=0)
		{
			System.out.println("not possible");
		}
		else {
			for(int i=0;i<len;i=i+val)
			{
				newval[temp]=s.substring(i, i+val);
				temp++;
			
			}
			System.out.println("Arrays equal parts are" );
			for(int i=0;i<newval.length;i++)
				{
				System.out.println(newval[i]);
				}
			

			}
	}
	
	
	
	
	//java program to find the subset in the string
	
			public static void subset(String s,String res)
			{
				if(s.length()==0)
				{
					System.out.print(res+" ");
					return;
				}
				for(int i=0;i<s.length();i++)
				{
					char c= s.charAt(i);
					String ros = s.substring(0, i)+s.substring(i+1);
					subset(ros,res+c);
					
				}
				
			}
	
	
	
	// java program to find the maximum and minimum occuring character in a string
			
			
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
					maxOcc= Collections.max(charMap.values());
					minOcc =Collections.min(charMap.values());
					char Max=Character.MIN_VALUE;
					char Min =Character.MAX_VALUE;
					for(Entry<Character,Integer> entry:charMap.entrySet())
					{
						if(entry.getValue()==maxOcc)
						{
							Max =entry.getKey();
							maxOcc =entry.getValue();
						}
						if(entry.getValue()==minOcc)
						{
							Min =entry.getKey();
							minOcc=entry.getValue();
						}
					}
					System.out.println("Max CHarater: " + Max+":"+maxOcc);
					System.out.println("Min CHarater: " + Min+":"+minOcc);
				
				
				
			}
	
	// Java program to find the smallest and longest palindrome
			
			  static boolean checkPalin(String word) 
			    { 
			        int n = word.length(); 
			  
			        // making the check case 
			        // case insensitive 
			        word = word.toLowerCase(); 
			  
			        // loop to check palindrome 
			        for (int i = 0; i < n; i++, n--) 
			            if (word.charAt(i) !=  
			                       word.charAt(n - 1)) 
			                return false; 
			  
			        return true; 
			    } 
			  
			    // Function to find longest 
			    // palindrome word 
			    static String longestPalin(String str) 
			    { 
			        // to check last word for palindrome 
			        str = str + " "; 
			  
			        // to store each word 
			        String longestword = "", word = ""; 
			  
			        int length, length1 = 0; 
			        for (int i = 0; i < str.length(); i++)  
			        { 
			            char ch = str.charAt(i); 
			  
			            // extracting each word 
			            if (ch != ' ') 
			                word = word + ch; 
			            else { 
			                length = word.length(); 
			                if (checkPalin(word) &&  
			                             length > length1) 
			                { 
			                    length1 = length; 
			                    longestword = word; 
			                } 
			  
			                word = ""; 
			            } 
			        } 
			  
			        return longestword; 
			    } 
			  
			
				
	
	
	
	

}