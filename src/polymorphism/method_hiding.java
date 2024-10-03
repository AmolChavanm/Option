package polymorphism;

public class method_hiding 
{
	public static void add(int a,int b)
	{
		int add=a+b;
		System.out.println("Addition of two number"+add);
		
	}
	
	public static void add(int a,int b,int c)
	{
		int ad=a+b+c;
		System.out.println("Addition of three number"+ad);
		
	}
	
	public static void main(String[] args) 
	{
		add(45,43);
		add(12,12,12);
		
	}

}
