package arraysexam;

import java.util.Scanner;

public class ArraysExample {
	
	
	public static void addarray(int[] a)
	{
		
	}

	public static void main(String[] args) 
	{

		System.out.println("Please enter the total number of integer number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		int [] a = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Please enter integer"+ i);
			 a[i] = sc.nextInt();			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		sc.close();
		
		
	}

}
