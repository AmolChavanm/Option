package Pratice_seesion;

public class demo2 
{
	public static void main(String[] args) 
	{
		System.out.println("This is the example of non-static method");
		demo2 ref = new demo2();
		ref.m3();
		ref.m4();
		Method a= new Method();
		a.m5();
		
		
	}

	public void m3()
	{
		System.out.println("Thsi is the M3 method");
	}
	
	public void m4()
	{
		System.out.println("Thsi is the M4 method");
	}
	public static void m6()
	{
		System.out.println("This is the m6 method");
	}
	
	
}
