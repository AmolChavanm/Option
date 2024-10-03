package Super_kay;

public class Demo1 extends Demo2
{
	int a=20;
	
	public void test1()
	{
		int a=50;
	//	int x=60;
		
		System.out.println(a);
		System.out.println(this.a);  //this is access the global var into local method 
		
		System.out.println(super.a);
		// this is used to access variable acquired from super class
		
		
		
	}
	
	public static void main(String[] args) 
	{
	
		Demo1 aa= new Demo1();
		aa.test1();
		
		
	}

}
