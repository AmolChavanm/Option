package Pratice_seesion;

public class globalvar 
{
	String str="Hello java world";
	
	String name="python";
	
	public void m1()
	{
		System.out.println("Global varible in method m1 = "+str);
	}

	public void m3()
	{
		System.out.println("Global variable in method m3 = "+name);
	}
	
	public static void main(String[] args) 
	{
		
		globalvar aa =new globalvar();
		aa.m1();
		aa.m3();
		
		
	}




}

