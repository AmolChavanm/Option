package Casting;

public class explicit
{
	
	public void m1()
	{
		
		double a=50.8;  // 8 byte
		System.out.println(a);
		int b= (int)a; // 4 byte
		System.out.println(b);
		
	}
	
	public static void main(String[] args) 
	{
		
		explicit aa = new explicit();
		aa.m1();
		
		
	}

}
