package pattern;

public class PatternTest {
	
	public static void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>0;j--)
			{
				if(i==j) {
				System.out.print("*");
				}else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

	public static void pattern2(int n)
	{
		for(int i=1;i<n/2;i++)
		{
			for(int j=n;j>=1;j--)
			{
				if(j==n/2||i==n-j||j==n-j) {
				System.out.print("*");
				}else
				{
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j*i+" ");
			}
			System.out.println();
		}
	}

	
	public static void pattern4(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n/2;j++)
			{
				if(i==j)
				{
					System.out.print(j);
				}
				else if(i>n/2&&j==n-i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
			
			
		}
	}
	
	
	/*
0
909
89098
7890987
678909876
56789098765
4567890987654
345678909876543
23456789098765432
1234567890987654321
	 */
	

	public static void pattern6(int n)
	{
		int count;
		int j;
		for(int i=1;i<=n;i++)
		{
			count =0;
			for( j=1;j<n;j++)
			{
				if(count<i-1)
				{
					if(!(j<n-i+1))
					{
						System.out.print(j);		
						count++;
					}
				}
			}
		System.out.print(0);
		count=0;
		for(--j;j>=1;j--)
		{
			if(count<i-1)
			{
				System.out.print(j);
				count++;
			}
		}
		System.out.println();
		}
		
	}
	

	public static void pattern7(int n)
	{
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+(char)(65+i));
			}
			System.out.println();
		}
	}
	
	public static void pattern8(int n) {
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||i==n||j==0||j==n)
				{
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void pattern9(int n)
	{
		int count=1;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+1);
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//pattern1(5);
		//pattern2(10);
		//pattern3(10);
		String s ="apple";
		pattern7(s,s.length());
}
	
	public static void pattern7(String s, int n)
	{
		n=s.length();
		
		for(int i=0;i<n;i++)
		{
			int j=n-i-1;
			for(int k=0;k<n;k++)
			{
				if(k==i||k==j)
				{
					System.out.print(s.charAt(k));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
