package polymorphism;

public class OverA 
{
	public void addition(int num1,int num2)
	{
		int add=num1+num2;
		System.out.println("Addition of two number ="+add);
		
	}
	
	public void addition(int num1,int num2,int num3)
	{
		int add=num1+num2+num3;
		
		System.out.println("Addition of three number ="+add);
	}
	
	public static void main(String[] args) 
	{
		
		OverA aa = new OverA();
		aa.addition(25,25);
		aa.addition(12,24,12);
		
	}

}
