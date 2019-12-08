package arraysexam;

import java.util.Arrays;

public class Arraysewex 
{
	
	//method for rotating array to the left
	
	public static void rott(int[] arr, int n)
	{
	
		System.out.println(Arrays.toString(arr));
		
		// it will rotate to the number of time it needs to be rotated	
		
		for(int i=0;i<n;i++)
		{
			int first =arr[0];
			int j;
			// Second loop explains you about rottaing element in the array to the left
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	// methof to rotate the element to the right
	
	public static void rot(int[] a, int n)
	{
		System.out.println(Arrays.toString(a));
		for(int i=0;i<n;i++)
		{
			int last =a[a.length-1];
			int j;
			for(j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println(Arrays.toString(a));
		
		
	}
	
	
	// print the dups in 
	
	
	public static void main(String[] args) 
	{
		int[] a = {12,34,5,26};
		int n=2;
		
		rot(a,n);
	}

}
