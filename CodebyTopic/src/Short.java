import java.util.Arrays;

public class Short {
// bubble sort
	public static void main(String[] args) 
	{
	int[] arr = {12,4,33,14,22};
	bubble(arr);
	}
		
	public static void bubble(int[] arr)
	{
		
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp = arr[i];
				arr[i]= arr[i+1];
				arr[i+1]=temp;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
}
