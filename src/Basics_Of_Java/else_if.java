package Basics_Of_Java;

public class else_if 
{
	public static void main(String[] args) 
	{
		
     	else_if aa= new else_if();
	    aa.m1();
		
		
	}

	public void m1()
	{
		int side=44;
		
		if(side==3)
		{
			System.out.println("It is Triangle");
		}
		else if(side==4)
		{
			System.out.println("Is is square");
		}
		else if(side==5)
		{
			System.out.println("It is a pentagon");
		}
		else
		{
			System.out.println("Invalid input, please try later");
		}
			
	}
}
