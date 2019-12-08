package strings;

public class Singleton 
{
	public String s ;
	public static Singleton singleinst=null;
	private Singleton()
	{
		s="Hello how are you";
	}
	
	public static Singleton Singleton()
	{
		if(singleinst==null)
		{
			singleinst=new Singleton();
		}
		return singleinst;
}
	
}



