package tree;

public class BTS {

	BTS left;
	BTS right;
	int value;
	
	
	//constructor
	public BTS()
	{
		BTS left,right;
		int value;
	}
	//Constructor with single parameter
	public BTS(int n)
	{
		left =null;
		right=null;
		value =0;
	}
	// set left node
	public void setLeft(BTS n)
	{
		left=n;
	}
	// set right node
	public void setRight(BTS n)
	{
		right=n;
	}
	// get left node
	public BTS getLeft()
	{
		return left;
	}
	//get night node
	public BTS getRight()
	{
		return right;
	}
	
	// set value of node
	public void setData(int n)
	{
		value =n;
	}
	// get value of node
	public int getData()
	{
		return value;
	}
	


}
