package Basics_Of_Java;

public class nestedIf
{
	public static void main(String[] args) 
	{
		nestedIf ref= new nestedIf();
		ref.m1();
		
	}

	public void m1()
	{
		String uname="abc";
		String pass="abc@123";
		if(uname=="abc")  //true
		{
			System.out.println("User name is correct");
			
			if(pass=="abc@123")
			{
				System.out.println("You are sucessfully loged in ");
			}
		}
		else
		{
			System.out.println("Invalid user name and password, please try after sometime");
		}
		
		
		
		
	}
}
