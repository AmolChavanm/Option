package Logical_program;

public class Armstrong_number
{
	// 153 = raise power of each digit after that add it if it's equal to that no that is Armstrong no
	
	public static void main(String[] args) 
	{
		int num=153;
		int num1=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			
			num1=num1+(rem*rem*rem);
		}
		
		if(num1==num)
		{
		
			System.out.println("Given number "+num+" is Armstrong number");
			
		}
		else
		{
			System.out.println("Given number "+num+" is NOT Armstrong number");

		}
		
	}
		
		
		
		
		
		
}
