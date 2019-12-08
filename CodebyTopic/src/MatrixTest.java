
public class MatrixTest {
// 2d array and saddle point
	public static void main(String[] args)
	{
		int [][] a = {{1,2,3},{7,8,9},{4,5,6}};
		//print2darr(a);
		saddle(a);
		int original[][]={{1,3,4},{2,4,3},{3,4,5}}; 
		transpose(original);
	}
	// Transpose a Matrix
	
	public static void transpose(int[][] val)
	{
		int[][] trans =new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				trans[i][j]=val[j][i];
			}
		}
		
		
		System.out.println("Without transpose");
		for(int i=0;i<3;i++)
		{
			for(int j=0; j<3;j++)
			{
				System.out.print(val[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("With transpose");
		for(int i=0;i<3;i++)
		{
			for(int j=0; j<3;j++)
			{
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void print2darr(int[][] input)
	{
		for(int i=0;i<input.length;i++)
		{
			for(int j=0; j<input[0].length;j++)
			{
				System.out.print(input[i][j]+" ");
			}
		}
		
		
	}
	
	

	
	public static void saddle(int[][] input)
	{
		for(int i=0;i<input.length;i++)
		{
			boolean issaddle = true;
			int minimum = input[i][0];
			int colindrownum =0;
			
			for(int j=1;j<input[0].length;j++)
			{
				if(input[i][j]<minimum)
				{
					minimum = input[i][j];
					colindrownum=j;
				}
			}
			for(int j=0;j<input.length;j++)
			{
				if(minimum<input[j][colindrownum])
				{
					issaddle =false;
					break;
				}
			}
			if(issaddle)
			{
			System.out.println(minimum);
			}
		}
		
	}
	
	

}
