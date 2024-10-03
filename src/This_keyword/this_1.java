package This_keyword;

public class this_1 
{
	String str="this is a JAVA program";
	static int a=1;
	
	
	public void m1()
	{
		String str="This is not java program";
		
		System.out.println(str);  //will print the local method var values
		
		System.out.println(this.str); // print global var value
		
		System.out.println(this_1.a);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		this_1 aa = new this_1();
		aa.m1();
		
		
	}

}
