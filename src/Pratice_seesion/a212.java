package Pratice_seesion;

public class a212 extends aaa
{
	int a=20;
	
	public void test()
	{
		int a=50;
		int x=60;
		
		System.out.println("Values from test() local method = "+x);
		System.out.println("Values from test() local method = "+a);
		System.out.println("Values from global variable = "+this.a);
		System.out.println("value accessed from super class = "+super.a);
		
	}
	
	public static void main(String[] args) 
	{
	
		a212 aa= new a212();
		aa.test();
		
	}

}
