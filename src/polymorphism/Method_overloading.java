package polymorphism;

public class Method_overloading 
{
	
	public void addition(int num1,int num2)
	{
		int add=num1+num2;
		System.out.println("Addition of two number= "+add);
	}
	
	public void addition(int num1,float num2)
	{
		float add =num1+num2;
		System.out.println("Addition of two number= "+add);

	}

	public static void main(String[] args) 
	{
		
		Method_overloading aa= new Method_overloading();
		aa.addition(12,12);
		aa.addition(12, 12.3f);
	}
	
}
