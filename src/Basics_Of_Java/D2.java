package Basics_Of_Java;

public class D2 
{
	
	public static void main(String[] args)
	{
	
		circle();  //statics method calling
		D2 obj = new D2();   // non static method calling , here we need to create object of class b
		obj.Square(); 
		
	
		
	}
	
	public static void circle()
	{
		System.out.println("Thuis is circle");
		
	}

	public void Square()
	{
		
		System.out.println("This is square");
		
	}
}
