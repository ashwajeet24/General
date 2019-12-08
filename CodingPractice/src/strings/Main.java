package strings;

public class Main {

	public static void main(String[] args) {
		Singleton x = Singleton.Singleton();
		
		Singleton y=Singleton.Singleton();
		
		Singleton z = Singleton.Singleton();
		
		x.s =(x.s).toLowerCase();
		
		System.out.println("x "+x.s);
		System.out.println("Y " + y.s);
		System.out.println("z "+z.s);
		
		
		z.s =(z.s).toUpperCase();
		System.out.println("x "+x.s);
		System.out.println("Y " + y.s);
		System.out.println("z "+z.s);
		
	}

}
