package pseesion;

public class fabo 
{
	public static void main(String[] args) 
	{
		int n=15;
		int a=0;
		int b=1;
		
		System.out.println("Factorial of given "+n+" terms");
		
		for(int i=0;i<=n;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.println(a);
		}
		
	}

}
