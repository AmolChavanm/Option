package variable;

public class global
{

	int a=54;
	int b=23;
	
	public void m1()
	{
		
		System.out.println("This global var"+a);
	}
	
	public void m2()
	{
		System.out.println(b);
	}
	
	
	public static void main(String[] args) 
	{
		global aa= new global();
		aa.m1();
		aa.m2();
		
	}
	

}
