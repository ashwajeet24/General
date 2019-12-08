
public class STringTest {

	public static void main(String[] args) {
			
				String str = "This is a really simple sentence";
				CountCandV(str);
		
				String name = "The sky is blue";
				String reversestr ="";
			
			
		//rreverse word by word
				String[] word =name.split(" ");
				String revword ="";
				
				for(int j=word.length-1;j>=0;j--)
				{
					revword =revword+word[j]+ " ";
				}
				//reversestr =reversestr+revword;
		
			//System.out.println(reversestr);
			
			
			
			// Reverse the who;e sentence
			
			for(int i=name.length()-1;i>=0;i--)
			{
				reversestr =reversestr+name.charAt(i);
			}
			
			System.out.println(reversestr);
			
			
			
			
			
			
			//factorial of n
			
			int n=5;
			System.out.println(fact(5));
			int val = 234;
			revnum(val);
			int f =10;
			System.out.println(fibbo(f));
			
			int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
			int b[][]={{1,1,1},{2,2,2},{3,3,3}}; 
			mult(a,b);
			
	}
	
	
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*fact(n-1);
	}
	
	// reverse a number
	public static void revnum(int n)
	{
		int checknum =n;
		int rev =0;
		
		while(checknum!=0)
		{
			int rem = checknum%10;
			rev =rev*10+rem;
			checknum=checknum/10;
		}
		
		System.out.println(rev);
	}
	public static int fibbo(int n)
	{
	if(n==0)
	{
		return 0;
	}
	if(n==1||n==2)
	{
		return 1;
	}
	return fibbo(n-2)+fibbo(n-1);
	}
	
	//Multiply between matrix
	
	public static void mult(int[][] a,int[][] b)
	{
		int[][] c = new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=0;
				for(int k=0;k<3;k++)
				{
					c[i][j] +=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void CountCandV(String s)
	{
		int vCount =0;
		int cCount=0;
		String str= s.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='o'||str.charAt(i)=='a'||str.charAt(i)=='u'||str.charAt(i)=='e'||str.charAt(i)=='i')
			{
				vCount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				cCount++;
			}
		}
		System.out.println("Vowels: "+vCount);
		System.out.println("consonants: "+cCount);
		
		
	}
	
	

	
	
	
	
			
	
		
}
