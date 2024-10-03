package variable;

public class local 
{
	public void m1()
	{
		int a=212;
		System.out.println(a);
	}
	
	public static void m2()
	{
		int b=55444;
		System.out.println(b);
		
		
	}
	
	public static void main(String[] args) 
	{
		local aa = new local();
		aa.m1();
		m2();
		
	}

}
