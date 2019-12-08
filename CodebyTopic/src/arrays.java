import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class arrays {
// copy from one array to another array
	
	public static void main(String[] args) 
	{
			int[] a ={1, 2, 8, 3, 2, 2, 2, 5, 1 };
			freq(a);
			
			int[] arr = {2,4,5,7,8};
			rot(arr,3);
			System.out.println();
			String name="apple";
			char[] c =name.toCharArray();
			remdupsarr(c);
			int e[]={1,2,5,6,3,2};
			evenorodd(e);
			
	}
// frequency of each element in the array
	
	public static void evenorodd(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print("Even in array are: "+a[i]+"");
				System.out.println();
			}
			else
			{
				System.out.print("Odd in arrays are: "+a[i]+" ");
				System.out.println();
			}
		}
	}
	
	
	
	public static void freq(int[] val)
	{
		HashMap<Integer,Integer> intMap = new HashMap<>();
		for(int a:val)
		{
			if(intMap.containsKey(a))
			{
				intMap.put(a, intMap.get(a)+1);
			}
			else
			{
				intMap.put(a, 1);
			}
		}
		Set<Map.Entry<Integer,Integer>> entrySet =intMap.entrySet();
		for(Map.Entry<Integer, Integer>entry :entrySet)
		{
			if(entry.getValue()>0)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}
	
	public static void rot(int [] arr, int n)
	{
		for(int i=0;i<n;i++)
		{
			int last =arr[arr.length-1];
			int j;
			for( j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	
	
	//Remove duplicates from array
	public static void remdupsarr(char [] n)
	{
		HashMap<Character,Boolean> mp = new HashMap<>();
		for(int i=0;i<n.length;++i)
		{
			if(mp.get(n[i])==null)
				System.out.print(n[i]+" ");
			mp.put(n[i], true);
		}
	}
	
}
