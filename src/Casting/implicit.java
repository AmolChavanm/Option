package Casting;

public class implicit 
{
	public static void main(String[] args) 
	{
		implicit aa= new implicit();
		aa.m1();
		
	}

	public void m1()
	{
		int x=100; // 4 byte
		System.out.println(x);
		
		double y=x; // 8 byte
		System.out.println(y);
		
		
	}
}
