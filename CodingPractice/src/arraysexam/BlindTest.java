package arraysexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BlindTest {

	public static void main(String[] args) 
	{
				int max =0;
				
				int [] a = {12,33,45,6,7,8};
				Arrays.sort(a);
				ArrayList<Integer> list = new ArrayList<Integer>(a.length);
				for(int i: a)
				{
					list.add(i);
				}
			
				System.out.println(list);
				int min =list.get(0);
				int sec = list.get(list.size()-2);
				for(int j:list)
				{
					if(j>max)
					{
						max =j;	
					}
				}
			
				System.out.println(max);
				System.out.println(min);
				System.out.println(sec);
	}

}
