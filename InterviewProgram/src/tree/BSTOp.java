package tree;

public class BSTOp 
	{
		private BTS root;
		
		
		// constructor
		
		public BSTOp()
		{
			root = null;
		}
		
		public boolean isEmpty()
		{
			return root==null;
		}
		
		public void insert(int value)
		{
			root =insert(root,value);
		}
		
		private BTS insert(BTS node,int value)
		{
			if(node==null)
			{
				node= new BTS(value);
			}
			else
			{
				if(value<node.getData())
				{
					node.left=insert(node.left,value);
				}else
				{
					node.right=insert(node.right,value);
				}
			}
			return node;
			
		}
		
		
	}
