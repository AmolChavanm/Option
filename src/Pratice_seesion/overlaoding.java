package Pratice_seesion;

public class overlaoding
{
	public void addition(int num1,int num2)
	{
		int add=num1+num2;
		System.out.println("Addition of two number = "+add);
		
	}

	public void addition(int num1,float num2)
	{
		float add=num1+num2;
		System.out.println("Addition of two number = "+add);
		
	}
	public static void main(String[] args) 
	{
		overlaoding aa= new overlaoding();
		aa.addition(22,25);
		aa.addition(21, 21.5f);
		
	}
	
	
	
	
	
	
	
	
	
	
}
