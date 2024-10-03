package Pratice_seesion;

public class tgiskeyword 
{
	String str="Thsi is a java program";
	
	public void m1()
	{
		String str="This java in local method";
		
		System.out.println(str);  // local values
		System.out.println(this.str); // will print global values
		
	}
	
	public static void main(String[] args) 
	{
		tgiskeyword aa= new tgiskeyword();
		aa.m1();
		
	}

}
