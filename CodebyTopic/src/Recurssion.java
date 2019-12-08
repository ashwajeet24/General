
public class Recurssion {
// find all binary wildcard
	
	public static void wildcardtest(char[] pattern , int i)
	{
		if(i==pattern.length)
		{
			System.out.println(pattern);
			return;
		}
		
		if(pattern[i]=='?')
		{
			for(char c='0';c<='4';c++)
			{
				pattern[i]=c;
				
				wildcardtest(pattern,i+1);
				
				pattern[i]='?';
			}
			return;
		}
		wildcardtest(pattern,i+1);
	}
	
	
	public static void main(String[] args) {
				String a ="1?0?1000?";
				char [] pattern =a.toCharArray();
				wildcardtest(pattern,0);
	}

}
