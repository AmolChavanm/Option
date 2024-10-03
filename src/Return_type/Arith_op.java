package Return_type;

public class Arith_op
{
	
	public static void main(String[] args)
	{
		Arith_op op =new Arith_op();
		System.out.println(op.add()*op.add1());
		
	}

	public int add()
	{
		
		int a=23;
		int b=2;
		int c=a+b;
		return c;
		
	}
	
	public int add1()
	{
		int e=21;
		int f=4;
		int g=e+f;
		return g;
		
		
	}
}
