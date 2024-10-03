package pseesion;

public class arm 
{
	public static void main(String[] args) 
	{
	
		int num=407;
		int num1=0;
		
		
		for(int i=num;i>0;i=i/10)
		{
			System.out.println(i);
			
			int rem=i%10;
			
			num1=num1+(rem*rem*rem);
		}
		if(num==num1)
		{
			System.out.println("Given number "+num+ " is armstrong number");
		}
		else
		{
			System.out.println("Given number "+num+ " is NOT armstrong number");
	
		}
		
	}
	
}
